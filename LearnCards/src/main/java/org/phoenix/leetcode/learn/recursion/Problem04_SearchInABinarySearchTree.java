/**
 * You are given the root of a binary search tree (BST) and an integer val.
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 * <p>
 * Example 1:
 * Input: root = [4,2,7,1,3], val = 2
 * Output: [2,1,3]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 5000].
 * 1 <= Node.val <= 107
 * root is a binary search tree.
 * 1 <= val <= 107
 */
package org.phoenix.leetcode.learn.recursion;

public class Problem04_SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        // Edge case
        if (root == null) return null;
        // If value is found then return
        if (root.val == val) return root;
        // If given value is less then traverse left
        // else traverse right
        // searchBST will return the sub root head
        if (root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
