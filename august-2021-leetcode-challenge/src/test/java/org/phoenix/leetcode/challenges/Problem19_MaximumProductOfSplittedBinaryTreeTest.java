package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem19_MaximumProductOfSplittedBinaryTree.TreeNode;


class Problem19_MaximumProductOfSplittedBinaryTreeTest {

    private final Problem19_MaximumProductOfSplittedBinaryTree test = new Problem19_MaximumProductOfSplittedBinaryTree();

    @Test
    void maxProduct() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        assertEquals(110, test.maxProduct(root));
    }
}