package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem22_DeleteNodeInBST.TreeNode;

class Problem22_DeleteNodeInBSTTest {

    private final Problem22_DeleteNodeInBST test = new Problem22_DeleteNodeInBST();

    @Test
    void deleteNode() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        assertEquals(4, test.deleteNode(root, 3).left.val);
    }
}