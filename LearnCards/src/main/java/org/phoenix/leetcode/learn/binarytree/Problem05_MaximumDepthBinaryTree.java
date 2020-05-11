package org.phoenix.leetcode.learn.binarytree;

/*
* Given a binary tree, find its maximum depth.
* The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*
* Note: A leaf is a node with no children.
*
* Example:
* Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

* return its depth = 3.
* */

public class Problem05_MaximumDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        // root is null then depth is 0
        if (root == null) return 0;
        // getting the left node depth
        int left = maxDepth(root.left);
        // getting the left node depth
        int right = maxDepth(root.right);
        // returning the max depth
        if (left > right) return (left + 1);
        else return (right + 1);
    }

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
