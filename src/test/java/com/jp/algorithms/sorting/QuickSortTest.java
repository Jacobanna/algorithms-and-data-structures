package com.jp.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {
    @Test
    public void quickSortManyValues() {
        //Given
        int[] array = new int[7];
        array[0] = 6;
        array[1] = 13;
        array[2] = 24;
        array[3] = -7;
        array[4] = 33;
        array[5] = 190;
        array[6] = 24;
        //When
        QuickSort.quickSort(array);
        int[] expectedArray = {-7, 6, 13, 24, 24, 33, 190};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void quickSortOneValue() {
        //Given
        int[] array = new int[1];
        array[0] = 6;
        //When
        QuickSort.quickSort(array);
        int[] expectedArray = {6};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void quickSortNoValues() {
        //Given
        int[] array = new int[3];
        //When
        QuickSort.quickSort(array);
        int[] expectedArray = {0, 0, 0};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void quickSortNullArray() {
        //Given
        int[] array = null;
        //When
        QuickSort.quickSort(array);
        int[] expectedArray = null;
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }
}
