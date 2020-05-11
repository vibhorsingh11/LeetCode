package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem05_MaximumDepthBinaryTree.TreeNode;

class Problem05_MaximumDepthBinaryTreeTest {

    private final Problem05_MaximumDepthBinaryTree test = new Problem05_MaximumDepthBinaryTree();

    @Test
    void maxDepth() {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        assertEquals(3, test.maxDepth(node));
    }
}