package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem26_SumRootToLeafNumbers.TreeNode;

class Problem26_SumRootToLeafNumbersTest {

    private final Problem26_SumRootToLeafNumbers test = new Problem26_SumRootToLeafNumbers();

    @Test
    void sumNumbers() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        assertEquals(1026, test.sumNumbers(root));
    }
}