package org.phoenix.leetcode.learn.queue_stack;

/*
* Given a binary tree, return the inorder traversal of its nodes' values.
* Example:
* Input: [1,null,2,3]
   1
    \
     2
    /
   3

* Output: [1,3,2]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem11_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // if root is null return empty list
        if (root == null) return list;
        // stack for storing nodes
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        // looping over current node
        while (temp != null || !stack.isEmpty()) {
            // if current node is not null then add it to stack and move left
            // else pop from stack and add to result list, then move right
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

    //  Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
