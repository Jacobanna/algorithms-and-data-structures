package com.jp.algorithms.sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        if (array == null) {
            return null;
        }
        int minIndex;
        int temp;
        int j;
        for (int i = 0; i < array.length - 1 ; i++) {
            minIndex = i;
            for (j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
