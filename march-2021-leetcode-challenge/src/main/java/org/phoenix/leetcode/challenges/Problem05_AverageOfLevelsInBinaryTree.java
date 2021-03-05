/**
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * Example 1:
 * Input:
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Output: [3, 14.5, 11]
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 */
package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem05_AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        // List to store results
        List<Double> list = new ArrayList<>();
        // Check if tree is empty
        if (root == null) return list;
        // Store the average sum
        double sum = 0;
        // Queue to store the tree nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // Looping until queue is empty
        while (!queue.isEmpty()) {
            int size = queue.size();
            // Looping for all the nodes at same level
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                // Adding left nodes
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                // Adding right nodes
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            // Adding average of each level to the list
            list.add(sum / size);
            // Resetting the average sum for next level
            sum = 0;
        }
        return list;
    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
