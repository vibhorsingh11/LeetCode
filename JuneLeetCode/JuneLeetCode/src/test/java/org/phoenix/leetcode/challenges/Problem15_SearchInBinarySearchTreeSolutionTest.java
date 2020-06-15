package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem15_SearchInBinarySearchTreeSolution.TreeNode;

class Problem15_SearchInBinarySearchTreeSolutionTest {

    private final Problem15_SearchInBinarySearchTreeSolution test = new Problem15_SearchInBinarySearchTreeSolution();

    @Test
    void searchBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);

        assertEquals(2, test.searchBST(root, 2).val);
    }
}