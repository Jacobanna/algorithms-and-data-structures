package com.jp.algorithms.sorting;

public class SelectSort {
    public static int[] selectSort(int[] array) {
        if(array == null) {
            return null;
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
        return array;
    }
}
