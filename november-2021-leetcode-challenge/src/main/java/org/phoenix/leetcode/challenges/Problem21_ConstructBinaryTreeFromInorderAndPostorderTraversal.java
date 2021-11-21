package org.phoenix.leetcode.challenges;

/**
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder
 * is the postorder traversal of the same tree, construct and return the binary tree.
 */

public class Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return binaryTree(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
    }

    public TreeNode binaryTree(int[] inorder, int[] postorder, int inStart, int inEnd, int poIndex) {
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[poIndex]);
        poIndex--;

        if (inStart == inEnd) return root;

        int nodeIndex = search(inStart, inEnd, inorder, root.val);
        root.right = binaryTree(inorder, postorder, nodeIndex + 1, inEnd, poIndex);
        root.left = binaryTree(inorder, postorder, inStart, nodeIndex - 1, poIndex + nodeIndex - inEnd);
        return root;
    }

    public int search(int inStart, int inEnd, int[] inorder, int value) {
        int i;
        for (i = inStart; i <= inEnd; i++) {
            if (inorder[i] == value) {
                break;
            }
        }
        return i;
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
