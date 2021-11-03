package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem03_SumRootToLeafNumbers.TreeNode;

class Problem03_SumRootToLeafNumbersTest {

    private final Problem03_SumRootToLeafNumbers test = new Problem03_SumRootToLeafNumbers();

    @Test
    void sumNumbers() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(25, test.sumNumbers(root));
    }
}