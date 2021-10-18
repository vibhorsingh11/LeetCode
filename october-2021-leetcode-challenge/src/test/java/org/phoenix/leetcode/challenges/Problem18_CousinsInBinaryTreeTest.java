package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.phoenix.leetcode.challenges.Problem18_CousinsInBinaryTree.TreeNode;

class Problem18_CousinsInBinaryTreeTest {

    private final Problem18_CousinsInBinaryTree test = new Problem18_CousinsInBinaryTree();

    @Test
    void isCousins() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        assertFalse(test.isCousins(root, 4, 3));
    }
}