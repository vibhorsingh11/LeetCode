/**
 * Given the root of a binary tree, then value v and depth d, you need to add a row of nodes with value v at the
 * given depth d. The root node is at depth 1.
 * <p>
 * The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1, create two tree
 * nodes with value v as N's left subtree root and right subtree root. And N's original left subtree should be the left
 * subtree of the new left subtree root, its original right subtree should be the right subtree of the new right subtree root. If depth d is 1 that means there is no depth d-1 at all, then create a tree node with value v as the new root of the whole original tree, and the original tree is the new root's left subtree.
 */
package org.phoenix.leetcode.challenges;

import java.util.LinkedList;
import java.util.Queue;

public class Problem09_AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        // Base condition
        if (root == null) {
            return new TreeNode(v);
        }
        // If tree contain only 1 node then add and return
        if (d == 1) {
            TreeNode temp = new TreeNode(v);
            temp.left = root;
            return temp;
        }
        // Queue to store tree nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // Level of tree
        int level = 1;
        // Looping until d-1 depth is reached
        while (level != d - 1) {
            // Size of queue
            int size = queue.size();
            level++;
            // Looping for all values of the queue
            while (size-- > 0) {
                TreeNode temp = queue.poll();
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
        }
        // Looping until queue is empty and then adding the new
        // node at the specified depth of the tree
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            TreeNode temp = node.left;
            node.left = new TreeNode(v);
            node.left.left = temp;
            temp = node.right;
            node.right = new TreeNode(v);
            node.right.right = temp;
        }
        return root;
    }
}
