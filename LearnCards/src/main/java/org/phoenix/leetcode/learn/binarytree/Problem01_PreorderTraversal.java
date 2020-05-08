package org.phoenix.leetcode.learn.binarytree;

/*
* Given a binary tree, return the preorder traversal of its nodes' values.
*
* Example:
* Input: [1,null,2,3]
   1
    \
     2
    /
   3

* Output: [1,2,3]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem01_PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        // list for returning the nodes
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        // stack to store node of tree
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp;
        // looping over the stack until its empty
        while (!stack.empty()) {
            // popping node from stack and adding it to list
            temp = stack.pop();
            list.add(temp.val);
            // if tree's left or right node is not null then push them to stack
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
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
