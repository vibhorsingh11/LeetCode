/*
 * Given two binary trees original and cloned and given a reference to a node target in the original tree.
 * The cloned tree is a copy of the original tree.
 * Return a reference to the same node in the cloned tree.
 * Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.
 *
 * Follow up: Solve the problem if repeated values on the tree are allowed.
 *
 * Input: tree = [7,4,3,null,null,6,19], target = 3
 * Output: 3
 * Explanation: In all examples the original and cloned trees are shown. The target node is a green node from the original
 * tree. The answer is the yellow node from the cloned tree.*/
package org.phoenix.leetcode.challenges;

public class Problem02_CorrespondingNodeInCloneOfTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return cloned;
        }
        return dfs(original, cloned, target);
    }

    private TreeNode dfs(TreeNode original, TreeNode cloned, TreeNode target) {
        if (original == target) {
            return cloned;
        }
        if (original.left != null) {
            TreeNode left = dfs(original.left, cloned.left, target);
            if (left != null) {
                return left;
            }
        }
        if (original.right != null) {
            return dfs(original.right, cloned.right, target);
        }
        return null;
    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
