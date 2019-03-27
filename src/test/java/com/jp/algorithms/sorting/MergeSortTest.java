package com.jp.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    public void mergeSortManyValues() {
        //Given
        int[] array = new int[5];
        array[0] = 7;
        array[1] = 12;
        array[2] = 3;
        array[3] = 1;
        array[4] = 9;
        //When
        MergeSort.mergeSort(array);
        int[] expectedArray = {1, 3, 7, 9, 12};
        //Then
        Assert.assertTrue(Arrays.equals(array, expectedArray));
    }

    @Test
    public void mergeSortOneValue() {
        //Given
        int[] array = new int[1];
        array[0] = 7;
        //When
        MergeSort.mergeSort(array);
        int[] expectedArray = {7};
        //Then
        Assert.assertTrue(Arrays.equals(array, expectedArray));
    }

    @Test
    public void mergeSortNoValues() {
        //Given
        int[] array = new int[3];
        //When
        MergeSort.mergeSort(array);
        int[] expectedArray = {0, 0, 0};
        //Then
        Assert.assertTrue(Arrays.equals(array, expectedArray));
    }

    @Test
    public void mergeSortNullArray() {
        //Given
        int[] array = null;
        //When
        MergeSort.mergeSort(array);
        int[] expectedArray = null;
        //Then
        Assert.assertTrue(Arrays.equals(array, expectedArray));
    }
}
