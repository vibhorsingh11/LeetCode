package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem26_InvertBinaryTree.TreeNode;

class Problem26_InvertBinaryTreeTest {

    private final Problem26_InvertBinaryTree test = new Problem26_InvertBinaryTree();

    @Test
    void invertTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        assertEquals(3, test.invertTree(root).left.val);
    }
}