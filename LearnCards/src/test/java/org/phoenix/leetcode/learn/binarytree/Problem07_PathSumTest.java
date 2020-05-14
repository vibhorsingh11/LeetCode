package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem07_PathSum.TreeNode;

class Problem07_PathSumTest {

    private final Problem07_PathSum test = new Problem07_PathSum();

    @Test
    void hasPathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        assertTrue(test.hasPathSum(root, 22));
    }
}