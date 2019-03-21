package com.jp.datastructures.stack;

import com.jp.datastructures.list.LinkedList;
import com.jp.datastructures.list.Node;

public class LinkedListStack {
    private LinkedList stack;

    public LinkedListStack(LinkedList stack) {
        this.stack = stack;
    }

    public void push(int value) {
        Node node = new Node(value);
        stack.addFirst(node);
    }

    public int pop() {
        Node node = stack.removeFirst();
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        return node.getData();
    }

    public int peek() {
        Node node = stack.getFirst();
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        return node.getData();
    }

    public boolean isEmpty() {
        if (stack.getFirst() != null) {
            return false;
        } else {
            return true;
        }
    }

    //Returns how far from top is value (at top = 0, next after top = 1 ...), or -1 if value is not on stack.
    public int search(int value) {
        int count = 0;
        Node temp = stack.getHead();
        if (temp == null) {
            return -1;
        }
        while (temp.getNext() != null) {
            if (temp.getData() == value) {
                return count;
            }
            count++;
            temp = temp.getNext();
        }
        if (temp.getData() == value) {
            return count;
        }
        return -1;
    }
}
