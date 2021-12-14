package org.phoenix.leetcode.challenges;

import org.phoenix.leetcode.challenges.Problem08_BinaryTreeTilt.TreeNode;

/**
 * Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with
 * a value in the inclusive range [low, high].
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 2 * 104].
 * 1 <= Node.val <= 105
 * 1 <= low <= high <= 105
 * All Node.val are unique.
 */

public class Problem14_RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val > high) return rangeSumBST(root.left, low, high);
        if (root.val < low) return rangeSumBST(root.right, low, high);
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }


}
