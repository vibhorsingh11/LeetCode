package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.phoenix.leetcode.challenges.Problem23_TwoSumIVInputIsABST.TreeNode;

class Problem23_TwoSumIVInputIsABSTTest {

    private final Problem23_TwoSumIVInputIsABST test = new Problem23_TwoSumIVInputIsABST();

    @Test
    void findTarget() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        int k = 9;
        assertTrue(test.findTarget(root, k));

    }
}