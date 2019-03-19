package com.jp.datastructures.list;

public class LinkedList {
    private Node head = null;

    public LinkedList() {
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
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

    public void add(int index, Node node) {
        Node temp = head;
        int position = 0;
        if (index == 0) {
            addFirst(node);
            return;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
                position++;
                if (index == position + 1) {
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                    return;
                }
            }
        }
        if (index == position + 1) {
            temp.setNext(node);
        } else {
            System.out.println("List has " + (position + 1) + " elements, possible indexes to add are: " + 0 + "-" +
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
        while (temp.getNext() != null) {
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
        System.out.println("List has " + (position + 1) + " elements, possible indexes to get are : " + 0 + "-" +
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
        while (temp.getNext() != null) {
            if (temp.getData() == value) {
                return position;
            }
            position++;
            temp = temp.getNext();
        }
        return -1;
    }

    public String traverse() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        String list = "";
        while (temp.getNext() != null) {
            list += temp.getData() + " ";
            temp = temp.getNext();
        }
        list += temp.getData();
        return list;
    }

    public Node reverseIterative() {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    public void reverseRecursive(Node node1) {
        if (node1 == null) {
            return;
        }
        if (node1.getNext() == null) {
            head = node1;
            return;
        }
        reverseRecursive(node1.getNext());
        Node node2 = node1.getNext();
        node2.setNext(node1);
        node1.setNext(null);
    }

    public Node removeFirst() {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            head = head.getNext();
            return temp;
        }
    }

    public Node removeLast() {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            Node temp2 = temp.getNext();
            temp.setNext(null);
            return temp2;
        }
    }
}
