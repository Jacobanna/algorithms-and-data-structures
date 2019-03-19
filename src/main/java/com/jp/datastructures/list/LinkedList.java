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

    public void addAtPos(int index, Node nodeAtPos) {
        Node temp = head;
        int position = 0;
        if (index == 0) {
            addFirst(nodeAtPos);
            return;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
                position++;
                if (index == position + 1) {
                    nodeAtPos.setNext(temp.getNext());
                    temp.setNext(nodeAtPos);
                    return;
                }
            }
        }
        if (index == position + 1) {
            temp.setNext(nodeAtPos);
        } else {
            System.out.println("List has " + (position+1) + " elements, possible indexes to addAtPos are: " + 0 + "-" +
                    position);
        }
    }
}
