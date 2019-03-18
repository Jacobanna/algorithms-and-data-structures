package com.jp.datastructures.list;

public class LinkedList {
    private Node head = null;

    public LinkedList() {
    }

    public void addFirst(Node first) {
        if (head == null) {
            head = first;
        } else {
            Node temp = head;
            head = first;
            head.setNext(temp);
        }
    }

    public void addLast(Node last) {
        if (head == null) {
            head = last;
            return;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(last);
        }
    }

    public String traverse() {
        Node temp = head;
        String list = "";
        while (temp.getNext() != null) {
            list += temp.getData() + " ";
            temp = temp.getNext();
        }
        list += temp.getData();
        return list;
    }
}
