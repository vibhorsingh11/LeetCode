package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.challenges.Problem20_KthSmallestElementInBST.TreeNode;

class Problem20_KthSmallestElementInBSTTest {

    private final Problem20_KthSmallestElementInBST test = new Problem20_KthSmallestElementInBST();

    @Test
    void kthSmallest() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        assertEquals(1, test.kthSmallest(root, 1));
    }
}