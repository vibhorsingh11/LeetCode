/*
 * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original
 * BST is changed to the original key plus sum of all keys greater than the original key in BST.
 * As a reminder, a binary search tree is a tree that satisfies these constraints:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Note: This question is the same as 1038: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 *
 * Example 1:
 * Input: root = [3,2,4,1]
 * Output: [7,9,4,10]
 *
 * Constraints:
 * The number of nodes in the tree is in the range [0, 104].
 * -104 <= Node.val <= 104
 * All the values in the tree are unique.
 * root is guaranteed to be a valid binary search tree.
 */
package org.phoenix.leetcode.challenges;

public class Problem09_ConvertBSTToGreaterTree {
    private int sum;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        // Recursion for right subtree
        convertBST(root.right);
        // Calculating sum
        root.val += sum;
        // Set value
        sum = root.val;
        // Recursion for left subtree
        convertBST(root.left);
        return root;
    }
}
