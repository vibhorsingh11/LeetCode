package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem08_BinaryTreeTilt.TreeNode;

class Problem08_BinaryTreeTiltTest {

    private final Problem08_BinaryTreeTilt test = new Problem08_BinaryTreeTilt();

    @Test
    void findTilt() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(1, test.findTilt(root));
    }
}