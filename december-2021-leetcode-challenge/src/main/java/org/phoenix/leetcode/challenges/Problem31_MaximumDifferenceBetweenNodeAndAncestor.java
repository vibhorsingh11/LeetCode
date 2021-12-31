package org.phoenix.leetcode.challenges;

import org.phoenix.leetcode.challenges.Problem08_BinaryTreeTilt.TreeNode;

/**
 * Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where
 * v = |a.val - b.val| and a is an ancestor of b.
 * <p>
 * A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 5000].
 * 0 <= Node.val <= 105
 */

public class Problem31_MaximumDifferenceBetweenNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode root, int min, int max) {
        if (root == null) return max - min;
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        return Math.max(dfs(root.left, min, max), dfs(root.right, min, max));
    }
}
