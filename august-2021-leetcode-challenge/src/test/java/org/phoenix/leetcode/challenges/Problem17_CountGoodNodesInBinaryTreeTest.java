package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem17_CountGoodNodesInBinaryTree.TreeNode;

class Problem17_CountGoodNodesInBinaryTreeTest {

    private final Problem17_CountGoodNodesInBinaryTree test = new Problem17_CountGoodNodesInBinaryTree();

    @Test
    void goodNodes() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        assertEquals(4, test.goodNodes(root));
    }
}