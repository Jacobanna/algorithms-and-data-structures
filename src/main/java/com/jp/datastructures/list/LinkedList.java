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

    public void add(int index, Node nodeAtPos) {
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
            System.out.println("List has " + (position+1) + " elements, possible indexes to add are: " + 0 + "-" +
                    position);
        }
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

    public Node get(int index) {
        Node temp = head;
        int position = 0;
        if (index == 0) {
            return getFirst();
        } else {
            if (head == null) {
                System.out.println("Cannot perform get(" + index + "), list is empty.");
                return null;
            }
            while (temp.getNext() != null) {
                temp = temp.getNext();
                position++;
                if (index == position) {
                    return temp;
                }
            }
        }
        System.out.println("List has " + (position+1) + " elements, possible indexes to get are : " + 0 + "-" +
                position);
        return null;
    }

    public void clear() {
        // GC will clean space eventually, I guess I don't have to care about it in this function.
        head = null;
    }

    public boolean contains(Node node) {
        if (head == null) {
            return false;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            if (node.equals(temp)) {
                return true;
            } else {
                temp = temp.getNext();
            }
        }
        return false;
    }

    public int indexOf(int value) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int position = 0;
        while(temp.getNext() != null) {
            if (temp.getData() == value) {
                return position;
            }
            position++;
            temp = temp.getNext();
        }
        return -1;
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
