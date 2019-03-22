package com.jp.datastructures.queue;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;

    public ArrayQueue(int[] queue) {
        this.queue = queue;
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    //Can be called enqueue
    public void add(int value) {
        if ((rear+1)%queue.length == front) {
            System.out.println("Queue is full, remove element first.");
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear+1)%queue.length;
        }
        queue[rear] = value;
    }

    public int peek() {
        if(isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    //Can be called dequeue
    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty, add element first.");
            return;
        } else if (front == rear) {
            front = rear = -1;
        } else {
            front = (front+1)%queue.length;
        }
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front + 1;
    }
}
