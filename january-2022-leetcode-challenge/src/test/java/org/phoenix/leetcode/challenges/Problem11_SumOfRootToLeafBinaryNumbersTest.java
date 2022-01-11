package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem11_SumOfRootToLeafBinaryNumbers.TreeNode;

class Problem11_SumOfRootToLeafBinaryNumbersTest {

    private final Problem11_SumOfRootToLeafBinaryNumbers test = new Problem11_SumOfRootToLeafBinaryNumbers();

    @Test
    void sumRootToLeaf() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        assertEquals(22, test.sumRootToLeaf(root));
    }
}