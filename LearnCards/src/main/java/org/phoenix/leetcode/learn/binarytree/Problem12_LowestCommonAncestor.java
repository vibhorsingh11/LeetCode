package org.phoenix.leetcode.learn.binarytree;

public class Problem12_LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        // if p or q value equals root
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        // Recur for left & right
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // left & right both are not null
        if (left != null && right != null) {
            return root;
        }
        // return left if left is not null
        return left != null ? left : right;
    }

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
