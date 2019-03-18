package com.jp.datastructures.list;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testAddFirst() {
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
    public void testAddLast() {
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
}