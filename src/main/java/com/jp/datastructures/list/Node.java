package com.jp.datastructures.list;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return getData() == node.getData() &&
                Objects.equals(getNext(), node.getNext());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getData(), getNext());
    }
}
