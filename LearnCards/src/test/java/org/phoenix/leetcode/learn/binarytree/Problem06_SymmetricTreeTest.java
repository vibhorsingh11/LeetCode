package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem06_SymmetricTree.TreeNode;

class Problem06_SymmetricTreeTest {

    private final Problem06_SymmetricTree test = new Problem06_SymmetricTree();

    @Test
    void isSymmetric() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        assertTrue(test.isSymmetric(node));
        assertFalse(test.isSymmetric(root));
        assertTrue(test.isSymmetricIterative(node));
        assertFalse(test.isSymmetricIterative(root));
    }
}