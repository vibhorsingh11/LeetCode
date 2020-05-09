package org.phoenix.leetcode.learn.binarytree;

/*
* Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]
Follow up: Recursive solution is trivial, could you do it iteratively?*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem03_PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        while (!nodes.isEmpty()) {
            TreeNode current = nodes.peek();
            if (current.left == null && current.right == null) {
                TreeNode node = nodes.pop();
                list.add(node.val);
            } else {
                if (current.right != null) {
                    nodes.push(current.right);
                    current.right = null;
                }
                if (current.left != null) {
                    nodes.push(current.left);
                    current.left = null;
                }
            }
        }
        return list;
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
