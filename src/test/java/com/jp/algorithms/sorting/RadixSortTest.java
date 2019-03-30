package com.jp.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RadixSortTest {
    @Test
    public void radixSortTestManyValues() {
        //Given
        int[] array = new int[6];
        array[0] = 201;
        array[1] = 300;
        array[2] = 7;
        array[3] = 4;
        array[4] = 27;
        array[5] = 3;
        //When
        RadixSort.radixSort(array);
        int[] expectedArray = {3, 4, 7, 27, 201, 300};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void radixSortOneValue() {
        //Given
        int[] array = new int[1];
        array[0] = 201;
        //When
        RadixSort.radixSort(array);
        int[] expectedArray = {201};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void radixSortTestNoValues() {
        //Given
        int[] array = new int[3];
        //When
        RadixSort.radixSort(array);
        int[] expectedArray = {0, 0, 0};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void radixSortTestNullArray() {
        //Given
        int[] array = null;
        //When
        RadixSort.radixSort(array);
        int[] expectedArray = null;
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }
}
