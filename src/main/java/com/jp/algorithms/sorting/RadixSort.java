package com.jp.algorithms.sorting;

public class RadixSort {
    public static void radixSort(int[] array) {
        if (array == null) {
            return;
        }
        sort(array, array.length);
    }

    private static void sort(int[] array, int size) {
        int max = getMax(array, size);
        for (int exponential = 1; max / exponential > 0; exponential = exponential * 10) {
            countSort(array, size, exponential);
        }
    }

    private static void countSort(int[] array, int size, int exponential) {
        int[] output = new int[size];
        int i;
        int[] count = new int[10];
        //Count number of digits at currently checked digit position, put in one of ten buckets (0, 1, ..., 8, 9)
        for (i = 0; i < size; i++) {
            count[(array[i] / exponential) % 10]++;
        }
        for (i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];

        }
        for (i = size-1; i>= 0; i--) {
            output[count[(array[i]/exponential)%10] - 1] = array[i];
            count[(array[i])/exponential%10]--;
        }
        for (i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }

    private static int getMax(int array[], int size) {
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


}
