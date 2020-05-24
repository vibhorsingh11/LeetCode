package org.phoenix.leetcode.challenges;

/*
 * Return the root node of a binary search tree that matches the given preorder traversal.
 *
 * (Recall that a binary search tree is a binary tree where for every node, any descendant of
 * node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
 * It's guaranteed that for the given test cases there is always possible to find a binary search tree with the
 * given requirements.
 *
 * Example 1:
 * Input: [8,5,1,7,10,12]
 * Output: [8,5,10,1,7,null,12]
 */

public class Problem24ConstructBSTFromPreorder {

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
