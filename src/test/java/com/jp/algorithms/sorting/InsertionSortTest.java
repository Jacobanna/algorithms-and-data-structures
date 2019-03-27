package com.jp.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {
    @Test
    public void insertionSortManyValues() {
        //Given
        int[] array = new int[8];
        array[0] = 7;
        array[1] = 21;
        array[2] = -4;
        array[3] = 13;
        array[4] = 123;
        array[5] = 17;
        array[6] = -200;
        array[7] = 17;
        //When
        array = InsertionSort.insertionSort(array);
        int[] expectedArray = {-200, -4, 7, 13, 17, 17, 21, 123};
        //Then
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void insertionSortOneValue() {
        //Given
        int[] array = new int[1];
        array[0] = 7;
        //When
        array = InsertionSort.insertionSort(array);
        int[] expectedArray = {7};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void insertionSortNoValues() {
        //Given
        int[] array = new int[3];
        //When
        array = InsertionSort.insertionSort(array);
        int[] expectedArray = {0, 0, 0};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void insertionSortNullArray() {
        //Given
        int[] array = null;
        //When
        array = InsertionSort.insertionSort(array);
        int[] expectedArray = null;
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }
}
