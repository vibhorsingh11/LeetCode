package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.challenges.Problem01_InvertBinaryTree.TreeNode;

class Problem01_InvertBinaryTreeTest {

    private final Problem01_InvertBinaryTree test = new Problem01_InvertBinaryTree();

    @Test
    void invertTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        assertEquals(2,test.invertTree(root).right.val);
    }
}