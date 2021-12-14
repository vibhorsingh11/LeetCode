package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem08_BinaryTreeTilt.TreeNode;

public class Problem14_RangeSumOfBSTTest {

    private final Problem14_RangeSumOfBST test = new Problem14_RangeSumOfBST();

    @Test
    void rangeSumBST() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        assertEquals(32, test.rangeSumBST(root, 7, 15));
    }
}