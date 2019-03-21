package com.jp.datastructures.stack;

import com.jp.datastructures.list.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListStackTest {
    @Test
    public void push() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        int value1 = 12;
        int value2 = 13;
        int value3 = 24;
        //When
        stack.push(value1);
        stack.push(value2);
        stack.push(value3);
        //Then
        Assert.assertEquals(24, stack.peek());
    }

    @Test
    public void pop() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        int value1 = 12;
        int value2 = 13;
        int value3 = 24;
        stack.push(value1);
        stack.push(value2);
        stack.push(value3);
        //When
        int receivedValue1 = stack.pop();
        int receivedValue2 = stack.pop();
        int receivedValue3 = stack.pop();
        //Then
        Assert.assertEquals(24, receivedValue1);
        Assert.assertEquals(13, receivedValue2);
        Assert.assertEquals(12, receivedValue3);
    }

    @Test
    public void popEmpty() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        //When & Then
        Assert.assertEquals(Integer.MIN_VALUE, stack.pop());
    }

    @Test
    public void peek() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        int value1 = 44;
        int value2 = 11;
        stack.push(value1);
        stack.push(value2);
        //When & Then
        Assert.assertEquals(11, stack.peek());
    }

    @Test
    public void peekEmpty() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        //When & Then
        Assert.assertEquals(Integer.MIN_VALUE, stack.peek());
    }

    @Test
    public void isEmptyTrue() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        //When & Then
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        int value1 = 12;
        stack.push(value1);
        //When & Then
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void searchContains() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        int value1 = 12;
        int value2 = 13;
        int value3 = 24;
        stack.push(value1);
        stack.push(value2);
        stack.push(value3);
        //When
        int foundValue = stack.search(12);
        //Then
        Assert.assertEquals(2, foundValue);
    }

    @Test
    public void searchDoesNotContain() {
        //Given
        LinkedListStack stack = new LinkedListStack(new LinkedList());
        int value1 = 12;
        int value2 = 13;
        int value3 = 24;
        stack.push(value1);
        stack.push(value2);
        stack.push(value3);
        //When
        int foundValue = stack.search(40);
        //Then
        Assert.assertEquals(-1, foundValue);
    }
}
