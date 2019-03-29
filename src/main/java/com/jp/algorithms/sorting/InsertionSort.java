package com.jp.algorithms.sorting;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        if(array == null) {
            return;
        }
        int current;
        int index;
        for (int i = 1; i < array.length; i++) {
            current = array[i];
            index = i;
            while (index > 0 && current < array[index-1]) {
                array[index] = array[index-1];
                index--;
            }
            array[index] = current;
        }
    }
}
