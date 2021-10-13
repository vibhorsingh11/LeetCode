package org.phoenix.leetcode.challenges;

/**
 * Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.
 * <p>
 * It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given test cases.
 * <p>
 * A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
 * <p>
 * A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses Node.right.
 * Constraints:
 * <p>
 * 1 <= preorder.length <= 100
 * 1 <= preorder[i] <= 108
 * All the values of preorder are unique.
 */

public class Problem13_ConstructBinarySearchTreeFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        // creating tree with initial root node
        TreeNode root = new TreeNode(preorder[0]);
        // looping over the preorder array
        for (int i = 1; i < preorder.length; i++) {
            // new node for insertion
            TreeNode node = new TreeNode(preorder[i]);
            TreeNode curr = root;
            while (true) {
                // comparing current node value with new node value
                if (node.val <= curr.val) {
                    // current left is empty then traverse else add new node
                    if (curr.left == null) {
                        curr.left = node;
                        break;
                    } else {
                        curr = curr.left;
                    }
                } else {
                    // current right is empty then traverse else add new node
                    if (curr.right == null) {
                        curr.right = node;
                        break;
                    } else {
                        curr = curr.right;
                    }
                }
            }
        }
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
