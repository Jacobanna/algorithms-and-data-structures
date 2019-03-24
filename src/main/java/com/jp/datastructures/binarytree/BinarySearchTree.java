package com.jp.datastructures.binarytree;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if(root == null) {
            root = new Node(data);
        } else if (data <= root.getData()) {
            root.setLeft(insert(root.getLeft(), data));
        } else if (data > root.getData()){
            root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node node, int data) {
        if (node == null) {
            return false;
        } else if (data == node.getData()) {
            return true;
        } else if (data <= node.getData()) {
            return search(node.getLeft(), data);
        } else {
            return search(node.getRight(), data);
        }
    }

    //Output in order - <root><left><right>
    public void preorder() {
        System.out.println("Preorder:");
        preorder(root);
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    //Output in order - <left><root><right>
    //Inorder will give sorted results if used on BST
    public void inorder() {
        System.out.println("Inorder:");
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.getLeft());
        System.out.println(node.getData());
        inorder(node.getRight());
    }

    //Output in order - <left><right><root>
    public void postorder() {
        System.out.println("Postorder:");
        postorder(root);
    }

    private void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.getLeft());
        postorder(node.getRight());
        System.out.println(node.getData());
    }
}
