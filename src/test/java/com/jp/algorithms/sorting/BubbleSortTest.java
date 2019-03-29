package com.jp.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    public void bubbleSortManyValues() {
        //Given
        int[] array = new int[7];
        array[0] = 7;
        array[1] = 14;
        array[2] = -3;
        array[3] = 27;
        array[4] = 44;
        array[5] = 31;
        array[6] = -200;
        //When
        BubbleSort.bubbleSort(array);
        int[] expectedArray = {-200, -3, 7, 14, 27, 31, 44};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void bubbleSortOneValue() {
        //Given
        int[] array = new int[1];
        array[0] = 7;
        //When
        BubbleSort.bubbleSort(array);
        int[] expectedArray = {7};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void bubbleSortNoValues() {
        //Given
        int[] array = new int[3];
        //When
        BubbleSort.bubbleSort(array);
        int[] expectedArray = {0, 0, 0};
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }

    @Test
    public void bubbleSortNullArray() {
        //Given
        int[] array = null;
        //When
        BubbleSort.bubbleSort(array);
        int[] expectedArray = null;
        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, array));
    }
}
