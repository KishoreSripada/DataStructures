package com.examples.datastructures.trees;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;


public class BinarySearchTreeTest {

    @Mock
    private BinarySearchTree bst;

    @Before
    public void initialize() {
        bst = new BinarySearchTree(15);
        bst.insert(20);
        bst.insert(2);
        bst.insert(12);
        bst.insert(1);
        bst.insert(11);
    }

    @Test
    public void insert_existing_value() {
        bst.insert(20);
    }

    @Test
    public void print_inorder_traversal() {
        bst.printInOrderTraversal();
    }
}