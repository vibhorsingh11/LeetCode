package org.phoenix.leetcode.learn.binarytree;

public class Problem08_TreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return binaryTree(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
    }

    public TreeNode binaryTree(int[] inorder, int[] postorder, int inStart, int inEnd, int poIndex) {
        // if inorder start is greater than inorder end
        if (inStart > inEnd) return null;
        // we know that last value in the postorder is the root value
        TreeNode root = new TreeNode(postorder[poIndex]);
        // decreasing postorder index
        poIndex--;
        // if inStart equals inorder end return root node
        if (inStart == inEnd) return root;
        // searching for the index of root node in inorder array
        int nodeIndex = search(inStart, inEnd, inorder, root.val);
        // recursively finding the right node of the tree
        root.right = binaryTree(inorder, postorder, nodeIndex + 1, inEnd, poIndex);
        root.left = binaryTree(inorder, postorder, inStart, nodeIndex - 1, poIndex + nodeIndex - inEnd);
        return root;
    }

    public int search(int inStart, int inEnd, int[] inorder, int value) {
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
