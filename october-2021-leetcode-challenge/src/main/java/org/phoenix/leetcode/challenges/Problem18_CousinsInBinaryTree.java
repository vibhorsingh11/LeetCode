package org.phoenix.leetcode.challenges;

/**
 * Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
 * <p>
 * Two nodes of a binary tree are cousins if they have the same depth with different parents.
 * <p>
 * Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 100].
 * 1 <= Node.val <= 100
 * Each node has a unique value.
 * x != y
 * x and y are exist in the tree.
 */

public class Problem18_CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        return level(root, x, 1) == level(root, y, 1) && !isSibling(root, x, y);
    }

    boolean isSibling(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        boolean flag = false;
        if (root.left != null && root.right != null) {
            flag = (root.left.val == x && root.right.val == y) ||
                    (root.left.val == y && root.right.val == x);
        }
        return flag || isSibling(root.left, x, y) || isSibling(root.right, x, y);
    }

    int level(TreeNode root, int value, int height) {
        if (root == null) return 0;
        if (root.val == value) {
            return height;
        }

        return level(root.right, value, height + 1) | level(root.left, value, height + 1);
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
