package com.jp.datastructures.queue;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListQueueTest {
    @Test
    public void add() {
        //Given
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        //When
        linkedListQueue.add(5);
        linkedListQueue.add(3);
        linkedListQueue.add(1);
        //Then
        Assert.assertEquals(3, linkedListQueue.getSize());
        Assert.assertEquals(5, linkedListQueue.peek());
    }

    @Test
    public void remove() {
        //Given
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.add(5);
        linkedListQueue.add(3);
        linkedListQueue.add(1);
        //When
        linkedListQueue.remove();
        linkedListQueue.remove();
        linkedListQueue.remove();
        linkedListQueue.remove();
        //Then
        Assert.assertEquals(0, linkedListQueue.getSize());
        Assert.assertEquals(Integer.MIN_VALUE, linkedListQueue.peek());
    }

    @Test
    public void peek() {
        //Given
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.add(5);
        linkedListQueue.add(3);
        linkedListQueue.add(1);
        linkedListQueue.add(17);
        linkedListQueue.add(13);
        linkedListQueue.remove();
        linkedListQueue.add(14);
        //When
        int value1 = linkedListQueue.peek();
        linkedListQueue.remove();
        int value2 = linkedListQueue.peek();
        linkedListQueue.remove();
        int value3 = linkedListQueue.peek();
        linkedListQueue.remove();
        int value4 = linkedListQueue.peek();
        linkedListQueue.remove();
        int value5 = linkedListQueue.peek();
        linkedListQueue.remove();
        int value6 = linkedListQueue.peek();
        //Then
        Assert.assertEquals(3, value1);
        Assert.assertEquals(1, value2);
        Assert.assertEquals(17, value3);
        Assert.assertEquals(13, value4);
        Assert.assertEquals(14, value5);
        Assert.assertEquals(Integer.MIN_VALUE, value6);
    }

    @Test
    public void isEmptyTrue() {
        //Given
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        //When & Then
        Assert.assertTrue(linkedListQueue.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        //Given
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        //When
        linkedListQueue.add(3);
        // Then
        Assert.assertFalse(linkedListQueue.isEmpty());
    }
}
