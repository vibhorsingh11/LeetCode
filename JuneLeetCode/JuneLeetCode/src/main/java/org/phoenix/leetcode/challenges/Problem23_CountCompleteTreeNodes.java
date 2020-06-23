package org.phoenix.leetcode.challenges;

public class Problem23_CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Left pointer - this will go only left
        TreeNode left = root;
        // Left subtree level counter
        int countLeft = 0;
        // Right pointer - this will go only right
        TreeNode right = root;
        // Right subtree level counter
        int countRight = 0;
        // Loop for the left subtree
        while (left != null) {
            countLeft++;
            left = left.left;
        }
        // Loop for the right subtree
        while (right != null) {
            countRight++;
            right = right.right;
        }
        // If the heights of both are same, it means all the levels are filled completely
        if (countLeft == countRight) {
            return (1 << countLeft) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
