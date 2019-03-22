package com.jp.datastructures.queue;

import com.jp.datastructures.list.Node;

public class LinkedListQueue {
    private Node front;
    private Node rear;
    private int size;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    //Can be called enqueue
    public void add(int value) {
        Node node = new Node(value);
        if (front == null && rear == null) {
            front = rear = node;
        } else {
            rear.setNext(node);
            rear = rear.getNext();
        }
        size++;

    }

    public int peek() {
        if (front == null) {
            return Integer.MIN_VALUE;
        }
        return front.getData();
    }

    //Can be called dequeue
    public void remove() {
        if (front == null) {
            System.out.println("Queue is empty, add element first.");
        } else if (front.equals(rear)) {
            front = rear = null;
            size--;
        } else {
            front = front.getNext();
            size--;
        }
    }

    public int getSize() {
        return size;
    }
}
