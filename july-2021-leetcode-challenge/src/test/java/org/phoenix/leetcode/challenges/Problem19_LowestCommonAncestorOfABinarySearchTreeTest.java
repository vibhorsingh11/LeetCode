package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem19_LowestCommonAncestorOfABinarySearchTree.TreeNode;

class Problem19_LowestCommonAncestorOfABinarySearchTreeTest {

    private final Problem19_LowestCommonAncestorOfABinarySearchTree test = new Problem19_LowestCommonAncestorOfABinarySearchTree();

    @Test
    void lowestCommonAncestor() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        assertEquals(root, test.lowestCommonAncestor(root, root.left, root.right));
    }
}