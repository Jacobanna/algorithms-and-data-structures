package com.jp.algorithms.sorting;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array == null) {
            return;
        }
        sort(array, 0, array.length-1);
    }

    private static void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle;
        //Putting values to left and right arrays
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];
        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < rightArraySize; j++) {
            rightArray[j] = array[middle + 1 + j];
        }
        //Comparing values from left and right array and putting values to final array
        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        int arrayIndex = left;
        while(leftArrayIndex < leftArraySize && rightArrayIndex < rightArraySize) {
            if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
                array[arrayIndex] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                array[arrayIndex] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
            arrayIndex++;
        }
        while(leftArrayIndex < leftArraySize) {
            array[arrayIndex] = leftArray[leftArrayIndex];
            leftArrayIndex++;
            arrayIndex++;
        }
        while(rightArrayIndex < rightArraySize) {
            array[arrayIndex] = rightArray[rightArrayIndex];
            rightArrayIndex++;
            arrayIndex++;
        }

    }
}
