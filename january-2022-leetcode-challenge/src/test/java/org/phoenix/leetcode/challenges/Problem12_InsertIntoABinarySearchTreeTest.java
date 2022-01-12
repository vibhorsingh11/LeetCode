package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem11_SumOfRootToLeafBinaryNumbers.TreeNode;

class Problem12_InsertIntoABinarySearchTreeTest {

    private final Problem12_InsertIntoABinarySearchTree test = new Problem12_InsertIntoABinarySearchTree();

    @Test
    void insertIntoBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        assertEquals(5, test.insertIntoBST(root, 5).right.left.val);
    }
}