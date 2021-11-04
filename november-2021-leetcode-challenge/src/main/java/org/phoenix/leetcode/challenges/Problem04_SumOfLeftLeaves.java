package org.phoenix.leetcode.challenges;

/***Given the root of a binary tree, return the sum of all left leaves.
 Constraints:

 The number of nodes in the tree is in the range [1, 1000].
 -1000 <= Node.val <= 1000
 */

public class Problem04_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
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
