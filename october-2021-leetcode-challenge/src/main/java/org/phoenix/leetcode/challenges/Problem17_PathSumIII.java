package org.phoenix.leetcode.challenges;

/**
 * Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.
 * <p>
 * The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 1000].
 * -109 <= Node.val <= 109
 * -1000 <= targetSum <= 1000
 */

public class Problem17_PathSumIII {
    int totalSum = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        dfs(root, 0, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return totalSum;
    }

    public void dfs(TreeNode node, int sum, int targetSum) {
        if (node == null) return;
        sum = node.val + sum;
        if (sum == targetSum) {
            totalSum++;
        }
        dfs(node.left, sum, targetSum);
        dfs(node.right, sum, targetSum);
    }

    static class TreeNode {
        final int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
