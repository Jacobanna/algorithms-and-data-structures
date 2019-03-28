package com.jp.algorithms.sorting;

public class QuickSort {
    public static void quickSort(int[] array) {
        if (array == null) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int border = partition(array, left, right);
        sort(array, left, border - 1);
        sort(array, border + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = middlePivot(array, left, right);
        int border = left - 1;
        int temp;
        int i = left;
        while (i < right) {
            if (array[i] < pivot) {
                border++;
                if (border != i) {
                    temp = array[i];
                    array[i] = array[border];
                    array[border] = temp;
                }
            }
            i++;
        }
        border++;
        if (border != right) {
            temp = array[right];
            array[right] = array[border];
            array[border] = temp;
        }
        return border;
    }

    //If pivot is different from last element, we must move pivot to last element so that partition() will work
    //We use middlePivot for cases where arrays are already sorted - worst case scenario for quickSort O(n^2) since
    // it compares all elements but changes none
    private static int middlePivot(int[] array, int left, int right) {
        int mid = left + (right - left) / 2;
        int pivot = array[mid];
        int temp = array[right];
        array[right] = array[mid];
        array[mid] = temp;
        return pivot;
    }
}
