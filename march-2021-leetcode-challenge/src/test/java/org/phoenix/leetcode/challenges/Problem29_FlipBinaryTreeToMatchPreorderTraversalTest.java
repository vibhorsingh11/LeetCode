package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem29_FlipBinaryTreeToMatchPreorderTraversalTest {

    private final Problem29_FlipBinaryTreeToMatchPreorderTraversal test = new Problem29_FlipBinaryTreeToMatchPreorderTraversal();

    @Test
    void flipMatchVoyage() {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        int[] voyage = new int[]{2, 1};
        System.out.println(test.flipMatchVoyage(head, voyage));
    }
}