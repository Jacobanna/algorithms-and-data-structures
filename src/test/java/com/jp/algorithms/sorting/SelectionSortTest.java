package com.jp.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {
    @Test
    public void selectionSortManyValues() {
        //Given
        int[] array = new int[5];
        array[0] = 7;
        array[1] = 1;
        array[2] = 4;
        array[3] = -12;
        array[4] = 43;
        int[] expectedArray = {-12, 1, 4, 7, 43};
        //When
        SelectionSort.selectionSort(array);
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void selectionSortOneValue() {
        //Given
        int[] array = new int[1];
        array[0] = 7;
        int[] expectedArray = {7};
        //When
        SelectionSort.selectionSort(array);
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void selectionSortNoValues() {
        //Given
        int[] array = new int[3];
        int[] expectedArray = {0, 0, 0};
        //When
        SelectionSort.selectionSort(array);
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void selectionSortNullArray() {
        //Given
        int[] array = null;
        int[] expectedArray = null;
        //When
        SelectionSort.selectionSort(array);
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }
}
