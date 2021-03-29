/**
 * You are given the root of a binary tree with n nodes, where each node is uniquely assigned a value from 1 to n. You are also given a sequence of n values voyage, which is the desired pre-order traversal of the binary tree.
 * <p>
 * Any node in the binary tree can be flipped by swapping its left and right subtrees. For example, flipping node 1 will have the following effect:
 * <p>
 * Flip the smallest number of nodes so that the pre-order traversal of the tree matches voyage.
 * <p>
 * Return a list of the values of all flipped nodes. You may return the answer in any order. If it is impossible to flip the nodes in the tree to make the pre-order traversal match voyage, return the list [-1].
 * <p>
 * Example 1:
 * Input: root = [1,2], voyage = [2,1]
 * Output: [-1]
 * Explanation: It is impossible to flip the nodes such that the pre-order traversal matches voyage.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is n.
 * n == voyage.length
 * 1 <= n <= 100
 * 1 <= Node.val, voyage[i] <= n
 * All the values in the tree are unique.
 * All the values in voyage are unique.
 */
package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

public class Problem29_FlipBinaryTreeToMatchPreorderTraversal {
    int i = 0;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> toBeSwappedN = new ArrayList<>();
        if (dfs(root, voyage, toBeSwappedN)) {
            return toBeSwappedN;
        } else {
            List<Integer> rejectCase = new ArrayList<>();
            rejectCase.add(-1);
            return rejectCase;
        }
    }

    private boolean dfs(TreeNode root, int[] voyage, List<Integer> toBeSwappedN) {
        if (root == null) {
            return true;
        }
        if (root.val != voyage[i]) {
            return false;
        } else {
            i++;
        }
        if (root.left != null && root.left.val != voyage[i]) {
            toBeSwappedN.add(root.val);
            return dfs(root.right, voyage, toBeSwappedN) && dfs(root.left, voyage, toBeSwappedN);
        } else {
            return dfs(root.left, voyage, toBeSwappedN) && dfs(root.right, voyage, toBeSwappedN);
        }
    }
}
