package org.phoenix.leetcode.challenges;

/**
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder
 * is the inorder traversal of the same tree, construct and return the binary tree.
 * Constraints:
 * <p>
 * 1 <= preorder.length <= 3000
 * inorder.length == preorder.length
 * -3000 <= preorder[i], inorder[i] <= 3000
 * preorder and inorder consist of unique values.
 * Each value of inorder also appears in preorder.
 * preorder is guaranteed to be the preorder traversal of the tree.
 * inorder is guaranteed to be the inorder traversal of the tree.
 */

public class Problem08_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode helper(int preIndex, int inStart, int inEnd, int[] preorder, int[] inorder) {
        // Edge Case
        if (preIndex > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        // Setting root of binary tree
        TreeNode root = new TreeNode(preorder[preIndex]);
        // Index
        int index = 0;
        // looping over the inorder array to find the root value
        for (int i = inStart; i <= inEnd; i++) {
            if (root.val == inorder[i]) {
                index = i;
                break;
            }
        }
        // Recursively create left and right subtrees
        root.left = helper(preIndex + 1, inStart, index - 1, preorder, inorder);
        root.right = helper(preIndex + index - inStart + 1, index + 1, inEnd, preorder, inorder);
        return root;
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
