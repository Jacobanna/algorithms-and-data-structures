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
        linkedList.addAtPos(0, node5);
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
        linkedList.addAtPos(3, node5);
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
        linkedList.addAtPos(4, node5);
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
        linkedList.addAtPos(-3, node5);
        linkedList.addAtPos(9, node5);
        //Then
        Assert.assertEquals(expectedList, linkedList.traverse());
    }
}