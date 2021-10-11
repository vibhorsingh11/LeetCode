package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.challenges.Problem11_DiameterOfBinaryTree.TreeNode;

class Problem11_DiameterOfBinaryTreeTest {

    private final Problem11_DiameterOfBinaryTree test = new Problem11_DiameterOfBinaryTree();

    @Test
    void diameterOfBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        assertEquals(3, test.diameterOfBinaryTree(root));
    }
}