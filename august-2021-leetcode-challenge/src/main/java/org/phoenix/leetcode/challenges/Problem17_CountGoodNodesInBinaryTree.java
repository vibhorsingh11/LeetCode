package org.phoenix.leetcode.challenges;

/**
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 * <p>
 * Return the number of good nodes in the binary tree.
 * Constraints:
 * <p>
 * The number of nodes in the binary tree is in the range [1, 10^5].
 * Each node's value is between [-10^4, 10^4].
 */

public class Problem17_CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }

    public int helper(TreeNode root, int minValue) {
        if (root == null) return 0;
        int res = root.val >= minValue ? 1 : 0;
        res += helper(root.left, Math.max(minValue, root.val));
        res += helper(root.right, Math.max(minValue, root.val));
        return res;
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
