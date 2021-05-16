package org.phoenix.leetcode.challenges;

/**
 * Given a binary tree, we install cameras on the nodes of the tree.
 * <p>
 * Each camera at a node can monitor its parent, itself, and its immediate children.
 * <p>
 * Calculate the minimum number of cameras needed to monitor all nodes of the tree.
 * Note:
 * The number of nodes in the given tree will be in the range [1, 1000].
 * Every node has value 0.
 */

public class Problem16_BinaryTreeCameras {
    private int count = 0;

    public int minCameraCover(TreeNode root) {
        if (dfs(root) == -1) {
            count++;
        }
        return count;
    }

    private int dfs(TreeNode root) {
        int left = 0;
        int right = 0;
        // Check for left and right subtree
        if (root.left == null && root.right == null) {
            return -1;
        }
        // dfs on left leaf node
        if (root.left != null) {
            left = dfs(root.left);
        }
        // dfs on right leaf
        if (root.right != null) {
            right = dfs(root.right);
        }
        // Check for cameras on left and
        // right leaf node and none is found
        // then add one
        if (left == -1 || right == -1) {
            count++;
            return 1;
        }
        // If left and right is not checked
        if (left == 0 && right == 0) {
            return -1;
        }
        // Continue traversing if camera is found
        if (left == 1 || right == 1) {
            return 0;
        }
        return count;
    }
}
