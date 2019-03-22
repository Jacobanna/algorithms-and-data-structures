package com.jp.datastructures.queue;

import org.junit.Assert;
import org.junit.Test;

public class ArrayQueueTest {
    @Test
    public void add() {
        //Given
        ArrayQueue arrayQueue = new ArrayQueue(new int[5]);
        //When
        arrayQueue.add(6);
        arrayQueue.add(3);
        arrayQueue.add(2);
        arrayQueue.add(12);
        arrayQueue.add(-7);
        arrayQueue.add(44);
        //Then
        Assert.assertEquals(5, arrayQueue.size());
    }

    @Test
    public void remove() {
        //Given
        ArrayQueue arrayQueue = new ArrayQueue(new int[5]);
        arrayQueue.add(6);
        arrayQueue.add(3);
        arrayQueue.add(2);
        arrayQueue.add(12);
        arrayQueue.add(-7);
        arrayQueue.add(44);
        //When
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        //Then
        Assert.assertEquals(0, arrayQueue.size());
    }

    @Test
    public void peek() {
        //Given
        ArrayQueue arrayQueue = new ArrayQueue(new int[5]);
        arrayQueue.add(6);
        arrayQueue.add(3);
        arrayQueue.add(2);
        arrayQueue.add(12);
        arrayQueue.add(-7);
        arrayQueue.add(44);
        //When
        int value1 = arrayQueue.peek();
        arrayQueue.remove();
        int value2 = arrayQueue.peek();
        arrayQueue.remove();
        int value3 = arrayQueue.peek();
        arrayQueue.remove();
        int value4 = arrayQueue.peek();
        arrayQueue.remove();
        int value5 = arrayQueue.peek();
        arrayQueue.remove();
        int value6 = arrayQueue.peek();
        arrayQueue.remove();
        //Then
        Assert.assertEquals(6, value1);
        Assert.assertEquals(3, value2);
        Assert.assertEquals(2, value3);
        Assert.assertEquals(12, value4);
        Assert.assertEquals(-7, value5);
        Assert.assertEquals(Integer.MIN_VALUE, value6);
    }

    @Test
    public void sizeEmpty() {
        //Given
        ArrayQueue arrayQueue = new ArrayQueue(new int[5]);
        //When & Then
        Assert.assertEquals(0, arrayQueue.size());
    }

    @Test
    public void sizeFrontEqualRear() {
        //Given
        ArrayQueue arrayQueue = new ArrayQueue(new int[5]);
        arrayQueue.add(5);
        //When & Then
        Assert.assertEquals(1, arrayQueue.size());
    }

    @Test
    public void sizeFull() {
        //Given
        ArrayQueue arrayQueue = new ArrayQueue(new int[5]);
        arrayQueue.add(12);
        arrayQueue.add(57);
        arrayQueue.add(14);
        arrayQueue.add(-30);
        arrayQueue.add(1);
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.add(99);
        arrayQueue.add(85);
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.add(13);
        arrayQueue.add(4);
        arrayQueue.add(7);
        arrayQueue.add(8);
        arrayQueue.add(9);
        //When & Then
        Assert.assertEquals(5, arrayQueue.size());
    }
}