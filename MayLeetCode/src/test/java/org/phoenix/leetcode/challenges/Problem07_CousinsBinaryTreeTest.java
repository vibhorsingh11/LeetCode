package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.phoenix.leetcode.challenges.Problem07_CousinsBinaryTree.TreeNode;

class Problem07_CousinsBinaryTreeTest {

    private final Problem07_CousinsBinaryTree test = new Problem07_CousinsBinaryTree();

    @Test
    void isCousins() {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.left.left = new TreeNode(4);
        n.right = new TreeNode(3);

        assertFalse(test.isCousins(n, 4, 3));

        TreeNode n1 = new TreeNode(1);
        n1.left = new TreeNode(2);
        n1.left.right = new TreeNode(4);
        n1.right = new TreeNode(3);
        n1.right.right = new TreeNode(5);

        assertTrue(test.isCousins(n1, 5, 4));
    }
}