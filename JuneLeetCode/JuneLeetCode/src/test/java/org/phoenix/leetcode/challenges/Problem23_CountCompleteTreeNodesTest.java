package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem23_CountCompleteTreeNodes.TreeNode;

class Problem23_CountCompleteTreeNodesTest {

    private final Problem23_CountCompleteTreeNodes test = new Problem23_CountCompleteTreeNodes();

    @Test
    void countNodes() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);

        assertEquals(6, test.countNodes(root));
    }
}