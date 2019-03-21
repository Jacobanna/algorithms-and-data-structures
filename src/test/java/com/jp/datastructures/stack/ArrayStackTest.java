package com.jp.datastructures.stack;

import org.junit.Assert;
import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void push() {
        //Given
        int stack[] = new int[10];
        ArrayStack arrayStack = new ArrayStack(stack);
        //When
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(10);
        arrayStack.push(22);
        arrayStack.push(1);
        arrayStack.push(123);
        arrayStack.push(-4);
        arrayStack.push(6);
        arrayStack.push(9);
        arrayStack.push(12);
        arrayStack.push(14);
        //Then
        Assert.assertEquals(9, arrayStack.getTop());
    }

    @Test
    public void pop() {
        //Given
        int stack[] = new int[10];
        ArrayStack arrayStack = new ArrayStack(stack);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(10);
        arrayStack.push(22);
        arrayStack.push(1);
        arrayStack.push(123);
        arrayStack.push(-4);
        arrayStack.push(6);
        arrayStack.push(9);
        arrayStack.push(12);
        //When
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        //Then
        Assert.assertEquals(-1, arrayStack.getTop());

    }

    @Test
    public void peekEmpty() {
        //Given
        int stack[] = new int[10];
        ArrayStack arrayStack = new ArrayStack(stack);
        //When
        int value = arrayStack.peek();
        //Then
        Assert.assertEquals(-1, arrayStack.peek());
    }

    @Test
    public void peekNotEmpty() {
        //Given
        int stack[] = new int[10];
        ArrayStack arrayStack = new ArrayStack(stack);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(10);
        arrayStack.push(22);
        arrayStack.push(1);
        arrayStack.push(123);
        //When
        int value = arrayStack.peek();
        //Then
        Assert.assertEquals(123, arrayStack.peek());
    }

    @Test
    public void isEmptyTrue() {
        //Given
        int stack[] = new int[10];
        ArrayStack arrayStack = new ArrayStack(stack);
        //When
        boolean isEmpty = arrayStack.isEmpty();
        //Then
        Assert.assertTrue(isEmpty);
    }

    @Test
    public void isEmptyFalse() {
        //Given
        int stack[] = new int[10];
        ArrayStack arrayStack = new ArrayStack(stack);
        arrayStack.push(5);
        arrayStack.push(7);
        //When
        boolean isEmpty = arrayStack.isEmpty();
        //Then
        Assert.assertFalse(isEmpty);
    }

    @Test
    public void searchContains() {
        //Given
        int stack[] = new int[10];
        ArrayStack arrayStack = new ArrayStack(stack);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(4);
        arrayStack.push(12);
        arrayStack.push(11);
        //When
        int foundElement1 = arrayStack.search(5);
        int foundElement2 = arrayStack.search(4);
        int foundElement3 = arrayStack.search(11);
        //Then
        Assert.assertEquals(4, foundElement1);
        Assert.assertEquals(2, foundElement2);
        Assert.assertEquals(0, foundElement3);
    }

    @Test
    public void searchDoesNotContain() {
        //Given
        int stack[] = new int[10];
        ArrayStack arrayStack = new ArrayStack(stack);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(4);
        arrayStack.push(12);
        arrayStack.push(11);
        //When
        int foundElement = arrayStack.search(244);
        //Then
        Assert.assertEquals(-1, foundElement);
    }
}
