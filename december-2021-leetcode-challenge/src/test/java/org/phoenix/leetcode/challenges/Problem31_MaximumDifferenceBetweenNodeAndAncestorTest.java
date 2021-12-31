package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem08_BinaryTreeTilt.TreeNode;

class Problem31_MaximumDifferenceBetweenNodeAndAncestorTest {

    private final Problem31_MaximumDifferenceBetweenNodeAndAncestor test = new Problem31_MaximumDifferenceBetweenNodeAndAncestor();

    @Test
    void maxAncestorDiff() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(0);
        root.right.right.left = new TreeNode(3);
        assertEquals(3, test.maxAncestorDiff(root));
    }
}