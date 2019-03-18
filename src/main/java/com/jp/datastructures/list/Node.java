package com.jp.datastructures.list;

public class Node {
    private int Data;
    private Node next;

    public Node(int data) {
        this.Data = data;
        this.next = null;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
