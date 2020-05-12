package org.phoenix.leetcode.learn.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Problem06_SymmetricTree {
    // Recursive Approach
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root, root);
    }

    public boolean symmetric(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 != null && n2 != null && n1.val == n2.val) {
            return symmetric(n1.left, n2.right) && symmetric(n1.right, n2.left);
        }
        return false;
    }

    // Iterative Approach
    public boolean isSymmetricIterative(TreeNode root) {
        // queue for storing the nodes
        Queue<TreeNode> queue = new LinkedList<>();
        // adding root node twice
        queue.add(root);
        queue.add(root);
        // loop until queue is empty
        while (!queue.isEmpty()) {
            // remove nodes from queue and assign it to new nodes for comparision
            TreeNode n1 = queue.poll();
            TreeNode n2 = queue.poll();
            // if n1 and n2 both are null
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null) return false;
            // if n1 value is not equal to n2 value
            if (n1.val != n2.val) return false;
            // adding child nodes of both tree
            queue.add(n1.left);
            queue.add(n2.right);
            queue.add(n1.right);
            queue.add(n2.left);
        }
        return true;
    }

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
