package org.phoenix.leetcode.challenges;

/**
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * <p>
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 * <p>
 * Design an algorithm that runs in less than O(n) time complexity.
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5 * 104].
 * 0 <= Node.val <= 5 * 104
 * The tree is guaranteed to be complete.
 */

public class Problem24_CountCompleteTreeNodes {
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

    //Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
