package com.jp.datastructures.stack;

public class ArrayStack {
    private int stack[];
    private int top;

    public ArrayStack(int[] stack) {
        this.stack = stack;
        this.top = -1;
    }

    public int getTop() {
        return top;
    }

    public void push(int value) {
        if(top == stack.length-1) {
            System.out.println("Stack is full, cannot push element.");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack is empty, cannot pop element.");
            return -1;
        }
        top--;
        return top+1;
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty, cannot peek element.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int search(int value) {
        int temp = top;
        while(temp > -1) {
            if(value == stack[temp]) {
                return temp;
            }
            temp--;
        }
        return -1;
    }
}
