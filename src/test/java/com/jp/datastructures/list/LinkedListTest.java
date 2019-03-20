package com.jp.datastructures.list;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void addFirst() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(33);
        Node node3 = new Node(1);
        LinkedList linkedList = new LinkedList();
        String expectedList = "1 33 15";
        //When
        linkedList.addFirst(node1);
        linkedList.addFirst(node2);
        linkedList.addFirst(node3);
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void addLast() {
        //Given
        Node node1 = new Node(25);
        Node node2 = new Node(43);
        Node node3 = new Node(17);
        LinkedList linkedList = new LinkedList();
        String expectedList = "25 43 17";
        //When
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void addAtPosFirst() {
        //Given
        Node node1 = new Node(35);
        Node node2 = new Node(43);
        Node node3 = new Node(22);
        Node node4 = new Node(-4);
        Node node5 = new Node(7);
        LinkedList linkedList = new LinkedList();
        String expectedList = "7 35 43 22 -4";
        //When
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        linkedList.add(0, node5);
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void addAtPosMiddle() {
        //Given
        Node node1 = new Node(35);
        Node node2 = new Node(43);
        Node node3 = new Node(22);
        Node node4 = new Node(-4);
        Node node5 = new Node(7);
        LinkedList linkedList = new LinkedList();
        String expectedList = "35 43 22 7 -4";
        //When
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        linkedList.add(3, node5);
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void addAtPosLast() {
        //Given
        Node node1 = new Node(35);
        Node node2 = new Node(43);
        Node node3 = new Node(22);
        Node node4 = new Node(-4);
        Node node5 = new Node(7);
        LinkedList linkedList = new LinkedList();
        String expectedList = "35 43 22 -4 7";
        //When
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        linkedList.add(4, node5);
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void addAtPosOutOfBoundaries() {
        //Given
        Node node1 = new Node(35);
        Node node2 = new Node(43);
        Node node3 = new Node(22);
        Node node4 = new Node(-4);
        Node node5 = new Node(7);
        LinkedList linkedList = new LinkedList();
        String expectedList = "35 43 22 -4";
        //When
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        linkedList.add(-3, node5);
        linkedList.add(9, node5);
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void getFirstNotEmpty() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(33);
        Node node3 = new Node(1);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        Node expectedNode = new Node(15);
        expectedNode.setNext(node2);
        //When
        Node returnedNode = linkedList.getFirst();
        //Then
        Assert.assertTrue(expectedNode.equals(returnedNode));
    }

    @Test
    public void getFirstEmpty() {
        //Given
        LinkedList linkedList = new LinkedList();
        //When
        Node returnedNode = linkedList.getFirst();
        //Then
        Assert.assertTrue(returnedNode == null);
    }

    @Test
    public void getLastNotEmpty() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(33);
        Node node3 = new Node(1);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        Node expectedNode = new Node(1);
        //When
        Node returnedNode = linkedList.getLast();
        //Then
        Assert.assertTrue(expectedNode.equals(returnedNode));
    }

    @Test
    public void getLastEmpty() {
        //Given
        LinkedList linkedList = new LinkedList();
        //When
        Node returnedNode = linkedList.getLast();
        //Then
        Assert.assertTrue(returnedNode == null);
    }

    @Test
    public void getNotEmpty() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(34);
        Node node3 = new Node(33);
        Node node4 = new Node(81);
        Node node5 = new Node(19);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        linkedList.addLast(node5);
        Node expectedNode = new Node(81);
        expectedNode.setNext(node5);
        //When
        Node returnedNode = linkedList.get(3);
        //Then
        Assert.assertTrue(expectedNode.equals(returnedNode));
    }

    @Test
    public void getEmpty() {
        //Given
        LinkedList linkedList = new LinkedList();
        //When
        Node returnedNode = linkedList.get(3);
        //Then
        Assert.assertTrue(returnedNode == null);
    }

    @Test
    public void getOutOfBoundaries() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(34);
        Node node3 = new Node(33);
        Node node4 = new Node(81);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        //When
        Node returnedNode = linkedList.get(-2);
        //Then
        Assert.assertTrue(returnedNode == null);
    }

    @Test
    public void clear() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(34);
        Node node3 = new Node(33);
        Node node4 = new Node(81);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        //When
        linkedList.clear();
        //Then
        Assert.assertTrue(linkedList.getLast() == null);
        Assert.assertTrue(linkedList.getFirst() == null);
    }

    @Test
    public void containsNotEmpty() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(34);
        Node node3 = new Node(33);
        Node node4 = new Node(81);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        //When&Then
        Assert.assertTrue(linkedList.contains(node3));
    }

    @Test
    public void containsEmpty() {
        //Given
        LinkedList linkedList = new LinkedList();
        //When
        Node node = new Node(15);
        // Then
        Assert.assertFalse(linkedList.contains(node));
    }

    @Test
    public void indexOfExists() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(34);
        Node node3 = new Node(33);
        Node node4 = new Node(81);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        //When
        int value = linkedList.indexOf(33);
        // Then
        Assert.assertEquals(2, value);
    }

    @Test
    public void indexOfDoesNotExist() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(34);
        Node node3 = new Node(33);
        Node node4 = new Node(81);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        //When
        int value = linkedList.indexOf(101);
        // Then
        Assert.assertEquals(-1, value);
    }

    @Test
    public void indexOfEmptyList() {
        //Given
        LinkedList linkedList = new LinkedList();
        //When
        int value = linkedList.indexOf(21);
        // Then
        Assert.assertEquals(-1, value);
    }

    @Test
    public void reverseIterativeManyElements() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(30);
        Node node3 = new Node(50);
        Node node4 = new Node(100);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        String expectedList = "100 50 30 15";
        //When
        linkedList.reverseIterative();
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void reverseIterativeOneElement() {
        //Given
        Node node1 = new Node(15);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        String expectedList = "15";
        //When
        linkedList.reverseIterative();
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void reverseIterativeNoElements() {
        //Given
        LinkedList linkedList = new LinkedList();
        //When
        linkedList.reverseIterative();
        //Then
        Assert.assertTrue(linkedList.getHead() == null);
    }

    @Test
    public void reverseRecursiveManyElements() {
        //Given
        Node node1 = new Node(15);
        Node node2 = new Node(30);
        Node node3 = new Node(50);
        Node node4 = new Node(100);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        String expectedList = "100 50 30 15";
        //When
        linkedList.reverseRecursive(linkedList.getHead());
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void reverseRecursiveOneElement() {
        //Given
        Node node1 = new Node(15);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        String expectedList = "15";
        //When
        linkedList.reverseRecursive(linkedList.getHead());
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void reverseRecursiveNoElements() {
        //Given
        LinkedList linkedList = new LinkedList();
        //When
        linkedList.reverseRecursive(linkedList.getHead());
        //Then
        Assert.assertTrue(linkedList.getHead() == null);
    }

    @Test
    public void removeFirstWithElements() {
        //Given
        Node node1 = new Node(20);
        Node node2 = new Node(13);
        Node node3 = new Node(44);
        Node node4 = new Node(67);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        Node expectedNode = node1;
        //When
        Node removedNode = linkedList.removeFirst();
        //Then
        Assert.assertEquals(expectedNode, removedNode);
    }

    @Test
    public void removeFirstNoElements() {
        //Given
        LinkedList linkedList = new LinkedList();
        Node expectedNode = null;
        //When
        Node removedNode = linkedList.removeFirst();
        //Then
        Assert.assertEquals(expectedNode, removedNode);
    }

    @Test
    public void removeLastWithElements() {
        //Given
        Node node1 = new Node(20);
        Node node2 = new Node(13);
        Node node3 = new Node(44);
        Node node4 = new Node(67);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        Node expectedNode = node4;
        //When
        Node removedNode = linkedList.removeLast();
        //Then
        Assert.assertEquals(expectedNode, removedNode);
    }

    @Test
    public void removeLastNoElements() {
        //Given
        LinkedList linkedList = new LinkedList();
        Node expectedNode = null;
        //When
        Node removedNode = linkedList.removeLast();
        //Then
        Assert.assertEquals(expectedNode, removedNode);
    }

    @Test
    public void removeFirstOccurenceFirst() {
        //Given
        Node node1 = new Node(20);
        Node node2 = new Node(13);
        Node node3 = new Node(44);
        Node node4 = new Node(67);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        String expectedList = "13 44 67";
        //When
        Boolean isDeleted = linkedList.removeFirstOccurence(20);
        //Then
        Assert.assertTrue(isDeleted);
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void removeFirstOccurenceMiddle() {
        //Given
        Node node1 = new Node(20);
        Node node2 = new Node(13);
        Node node3 = new Node(44);
        Node node4 = new Node(67);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        String expectedList = "20 13 67";
        //When
        Boolean isDeleted = linkedList.removeFirstOccurence(44);
        //Then
        Assert.assertTrue(isDeleted);
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void removeFirstOccurenceLast() {
        //Given
        Node node1 = new Node(20);
        Node node2 = new Node(13);
        Node node3 = new Node(44);
        Node node4 = new Node(67);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        String expectedList = "20 13 44";
        //When
        Boolean isDeleted = linkedList.removeFirstOccurence(67);
        //Then
        Assert.assertTrue(isDeleted);
        Assert.assertEquals(expectedList, linkedList.traverse());
    }

    @Test
    public void removeFirstOccurenceNotInList() {
        //Given
        Node node1 = new Node(20);
        Node node2 = new Node(13);
        Node node3 = new Node(44);
        Node node4 = new Node(67);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
        linkedList.addLast(node4);
        String expectedList = "20 13 44 67";
        //When
        Boolean isDeleted = linkedList.removeFirstOccurence(101);
        //Then
        Assert.assertFalse(isDeleted);
        Assert.assertEquals(expectedList, linkedList.traverse());
    }
}