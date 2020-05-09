package org.phoenix.leetcode.learn.binarytree;

/*
* Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
Follow up: Recursive solution is trivial, could you do it iteratively?*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem02_InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        // list for storing the node values
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        // stack for storing the nodes
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null || !stack.isEmpty()) {
            // if temp is not null then push it to stack and move left node
            // else pop node from stack and add it to list, then move right node
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                list.add(temp.val);
                temp = temp.right;
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
