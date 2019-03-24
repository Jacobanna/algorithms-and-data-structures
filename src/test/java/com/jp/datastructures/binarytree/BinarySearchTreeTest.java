package com.jp.datastructures.binarytree;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void insert() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(21);
        binarySearchTree.insert(13);
        binarySearchTree.insert(33);
        binarySearchTree.insert(4);
        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        //Then
        Assert.assertTrue(binarySearchTree.search(10));
        Assert.assertTrue(binarySearchTree.search(21));
        Assert.assertTrue(binarySearchTree.search(13));
        Assert.assertTrue(binarySearchTree.search(33));
        Assert.assertTrue(binarySearchTree.search(4));
        Assert.assertTrue(binarySearchTree.search(2));
        Assert.assertTrue(binarySearchTree.search(1));
        Assert.assertTrue(binarySearchTree.search(3));
        Assert.assertFalse(binarySearchTree.search(144));
        Assert.assertFalse(binarySearchTree.search(-7));
        Assert.assertFalse(binarySearchTree.search( 8));
    }

    @Test
    public void preorder1() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(60);
        binarySearchTree.insert(15);
        //Then
        binarySearchTree.preorder();
        System.out.println("Expected:\n10\n8\n6\n12\n60\n15");
    }

    @Test
    public void preorder2() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(13);
        binarySearchTree.insert(33);
        //Then
        binarySearchTree.preorder();
        System.out.println("Expected:\n10\n8\n6\n9\n12\n11\n13\n33");

    }

    @Test
    public void inorder1() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(60);
        binarySearchTree.insert(15);
        //Then
        binarySearchTree.inorder();
        System.out.println("Expected:\n6\n8\n10\n12\n15\n60");
    }

    @Test
    public void inorder2() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(13);
        binarySearchTree.insert(33);
        //Then
        binarySearchTree.inorder();
        System.out.println("Expected:\n6\n8\n9\n10\n11\n12\n13\n33");

    }

    @Test
    public void postorder1() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(60);
        binarySearchTree.insert(15);
        //Then
        binarySearchTree.postorder();
        System.out.println("Expected:\n6\n8\n15\n60\n12\n10");
    }

    @Test
    public void postorder2() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(13);
        binarySearchTree.insert(33);
        //Then
        binarySearchTree.postorder();
        System.out.println("Expected:\n6\n9\n8\n11\n33\n13\n12\n10 ");

    }

    @Test
    public void findMinExists() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        Assert.assertEquals(8, binarySearchTree.findMin());
    }

    @Test
    public void findMinDoesNotExist() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        Assert.assertEquals(Integer.MIN_VALUE, binarySearchTree.findMin());
    }

    @Test
    public void findMaxExists() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        Assert.assertEquals(12, binarySearchTree.findMax());
    }

    @Test
    public void findMaxDoesNotExist() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        Assert.assertEquals(Integer.MIN_VALUE, binarySearchTree.findMax());
    }

    @Test
    public void findHeightTypical() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(13);
        binarySearchTree.insert(33);
        //Then
        Assert.assertEquals(3, binarySearchTree.findHeight());
    }

    @Test
    public void findHeightAtRoot() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When
        binarySearchTree.insert(10);
        //Then
        Assert.assertEquals(0, binarySearchTree.findHeight());
    }

    @Test
    public void findHeightNullRoot() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //When & Then
        Assert.assertEquals(-1, binarySearchTree.findHeight());
    }

    @Test
    public void delete() {
        //Given
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(13);
        binarySearchTree.insert(33);
        //When
        binarySearchTree.delete(8);
        //Then
        binarySearchTree.inorder();
    }
}

