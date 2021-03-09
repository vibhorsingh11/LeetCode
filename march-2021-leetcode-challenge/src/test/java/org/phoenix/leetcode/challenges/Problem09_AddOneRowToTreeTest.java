package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_AddOneRowToTreeTest {

    private final Problem09_AddOneRowToTree test = new Problem09_AddOneRowToTree();

    @Test
    void addOneRow() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(5);

        TreeNode expected = test.addOneRow(root, 1, 2);
        assertEquals(1, expected.left.val);
        assertEquals(1, expected.right.val);
        assertEquals(2, expected.left.left.val);
        assertEquals(6, expected.right.right.val);
    }
}