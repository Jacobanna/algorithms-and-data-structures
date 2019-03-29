package com.jp.algorithms.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        if (array == null) {
            return;
        }
        int count = 0;
        int temp;
        boolean isSwapped = true;
        while (count < array.length - 1 && isSwapped) {
            isSwapped = false;
            for (int i = 0; i < array.length - 1 - count; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSwapped = true;
                }
            }
            count++;
        }
    }
}
