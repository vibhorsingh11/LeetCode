package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

class Problem29_VerticalOrderTraversalOfBinaryTreeTest {

    private final Problem29_VerticalOrderTraversalOfBinaryTree test = new Problem29_VerticalOrderTraversalOfBinaryTree();

    @Test
    void verticalTraversal() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        printTree(test.verticalTraversal(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        printTree(test.verticalTraversal(root));
    }

    private void printTree(List<List<Integer>> verticalOrderTraversal) {
        for (List<Integer> list : verticalOrderTraversal) {
            System.out.print(list + " ");
        }
        System.out.println();
    }
}