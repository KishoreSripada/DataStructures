package com.examples.datastructures.trees;

public class BinarySearchTree {

    BinarySearchTree left, right;
    int data;

    public BinarySearchTree(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new BinarySearchTree(value);
            } else {
                left.insert(value);
            }
        } else {
            if ( right == null ) {
                right = new BinarySearchTree(value);
            } else {
                right.insert(value);
            }
        }
    }

    public void printInOrderTraversal() {
        if ( left != null) {
            left.printInOrderTraversal();
        }
        System.out.println(data);
        if ( right != null) {
            right.printInOrderTraversal();
        }
    }

    public void printPreOrderTraversal() {
        System.out.println(data);
        if ( left != null) {
            left.printPreOrderTraversal();
        }
        if ( right != null) {
            right.printPreOrderTraversal();
        }
    }

    public void printPostOrderTraversal() {
        if ( left != null) {
            left.printPostOrderTraversal();
        }
        if ( right != null) {
            right.printPostOrderTraversal();
        }
        System.out.println(data);
    }

    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree(10);
        searchTree.insert(5);
        searchTree.insert(15);
        searchTree.insert(8);

        // In Order
        System.out.println("In Order");
        searchTree.printInOrderTraversal();
        // Pre Order
        System.out.println("Pre Order");
        searchTree.printPreOrderTraversal();
        // Post Order
        System.out.println("Post Order");
        searchTree.printPostOrderTraversal();
    }
}