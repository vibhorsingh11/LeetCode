package org.phoenix.leetcode.challenges;

/*
* Invert a binary tree.
*
* Example:
* Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
*
* Trivia:
* This problem was inspired by this original tweet by Max Howell:
*
* Google: 90% of our engineers use the software you wrote (Homebrew),
* but you can’t invert a binary tree on a whiteboard so f*** off.*/

public class Problem01_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        // traverse left & right subtree and store them in node
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // replace the left subtree with right subtree
        root.left = right;
        root.right = left;

        return root;
    }

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
