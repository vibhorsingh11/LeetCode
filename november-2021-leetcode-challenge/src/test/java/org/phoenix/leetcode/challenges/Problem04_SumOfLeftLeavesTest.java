package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem04_SumOfLeftLeaves.TreeNode;

class Problem04_SumOfLeftLeavesTest {

    private final Problem04_SumOfLeftLeaves test = new Problem04_SumOfLeftLeaves();

    @Test
    void sumOfLeftLeaves() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(24, test.sumOfLeftLeaves(root));
    }
}