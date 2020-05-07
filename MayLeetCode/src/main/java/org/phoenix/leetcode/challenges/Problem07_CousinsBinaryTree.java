package org.phoenix.leetcode.challenges;

/*
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes
 * in the tree.
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 *
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 * */

public class Problem07_CousinsBinaryTree {

    public boolean isCousins(TreeNode root, int x, int y) {
        return level(root, x, 1) == level(root, y, 1) && !isSibling(root, x, y);
    }
    // checking if both are sibling or not
    boolean isSibling(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        boolean flag = false;
        if (root.left != null && root.right != null) {
            flag = (root.left.val == x && root.right.val == y) ||
                    (root.left.val == y && root.right.val == x);
        }
        return flag || isSibling(root.left, x, y) || isSibling(root.right, x, y);
    }
    // calculating the depth of both the nodes
    int level(TreeNode root, int value, int height) {
        if (root == null) return 0;
        if (root.val == value) {
            return height;
        }

        return level(root.right, value, height + 1) | level(root.left, value, height + 1);
    }

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
