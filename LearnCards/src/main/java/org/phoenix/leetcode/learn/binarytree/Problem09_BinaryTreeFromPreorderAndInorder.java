package org.phoenix.leetcode.learn.binarytree;

public class Problem09_BinaryTreeFromPreorderAndInorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return binaryTree(inorder, preorder, 0, inorder.length - 1, 0);
    }

    public TreeNode binaryTree(int[] inorder, int[] preorder, int inStart, int inEnd, int preIndex) {
        // return null if preIndex is greater than preorder length & inStart is greater than inEnd
        if (preIndex > preorder.length - 1 || inStart > inEnd) return null;
        // creating the node from preOrder
        TreeNode root = new TreeNode(preorder[preIndex]);
        preIndex++;
        // start equals end the return node
        if (inStart == inEnd) return root;
        // finding the index in inOrder array
        int nodeIndex = search(inorder, inStart, inEnd, root.val);
        // creating the left node of root by setting the preIndex +1 as, it's the next element in preorder array
        root.left = binaryTree(inorder, preorder, inStart, nodeIndex - 1, preIndex);
        // creating right node but here we need to take care of left subtree, as they needs to traversed first
        // so, for right tree node's we have to skip the left subtree nodes at preIndex
        root.right = binaryTree(inorder, preorder, nodeIndex + 1, inEnd, preIndex + nodeIndex - inStart);
        return root;
    }

    public int search(int[] inorder, int inStart, int inEnd, int value) {
        int i;
        // looping over the inorder array to find the root value
        for (i = inStart; i <= inEnd; i++) {
            if (inorder[i] == value) {
                break;
            }
        }
        return i;
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
