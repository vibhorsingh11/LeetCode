package org.phoenix.leetcode.challenges;

/**
 * Given the root of a binary tree, flatten the tree into a "linked list":
 * <p>
 * The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
 * The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 2000].
 * -100 <= Node.val <= 100
 * <p>
 * <p>
 * Follow up: Can you flatten the tree in-place (with O(1) extra space)?
 */

public class Problem14_FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode1 root) {
        // Edge case
        if (root == null) return;
        // Until root is not null
        while (root != null) {
            // Left subtree is not empty
            if (root.left != null) {
                TreeNode1 left = root.left;
                TreeNode1 temp = left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = root.right;
                root.right = left;
                root.left = null;
            }
            root = root.right;
        }
    }

    // Definition for a binary tree node.
    public static class TreeNode1 {
        int val;
        TreeNode1 left;
        TreeNode1 right;

        TreeNode1(int val) {
            this.val = val;
        }

        TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
