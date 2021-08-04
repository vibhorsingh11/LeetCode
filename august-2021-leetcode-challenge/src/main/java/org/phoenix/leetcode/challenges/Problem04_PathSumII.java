package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where each path's sum equals targetSum.
 * <p>
 * A leaf is a node with no children.
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 */

public class Problem04_PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // Resultant list
        List<List<Integer>> paths = new ArrayList<>();
        // DFS
        traverse(root, targetSum, new ArrayList<Integer>(), paths);
        return paths;
    }

    private void traverse(TreeNode root, int target, List<Integer> current, List<List<Integer>> paths) {
        // Base case
        if (root == null) {
            return;
        }
        current.add(root.val);
        if (root.val == target && root.left == null && root.right == null) {
            paths.add(current);
            return;
        }
        traverse(root.left, target - root.val, new ArrayList<Integer>(current), paths);
        traverse(root.right, target - root.val, new ArrayList<Integer>(current), paths);
    }

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
