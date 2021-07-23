package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.phoenix.leetcode.challenges.Problem23_BinaryTreePruning.TreeNode;

class Problem23_BinaryTreePruningTest {

    private final Problem23_BinaryTreePruning test = new Problem23_BinaryTreePruning();

    @Test
    void pruneTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode expected = test.pruneTree(root);
        assertEquals(1, expected.val);
        assertEquals(0, expected.right.val);
        assertEquals(1, expected.right.right.val);
        assertNull(expected.right.left);
    }
}