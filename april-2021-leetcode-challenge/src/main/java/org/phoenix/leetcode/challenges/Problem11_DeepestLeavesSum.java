/**
 * Given the root of a binary tree, return the sum of values of its deepest leaves.
 * Constraints:
 * The number of nodes in the tree is in the range [1, 104].
 * 1 <= Node.val <= 100
 */
package org.phoenix.leetcode.challenges;

import java.util.LinkedList;
import java.util.Queue;

public class Problem11_DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        // Queue to store all nodes
        Queue<TreeNode> leaves = new LinkedList<>();
        leaves.offer(root);
        // variable to store the sum
        int sum = 0;
        // loop until queue is empty
        while (!leaves.isEmpty()) {
            // size of queue
            int size = leaves.size();
            sum = 0;
            // looping till size of queue
            while (size-- > 0) {
                // remove the queue
                TreeNode node = leaves.poll();
                // getting sum of node at each level
                sum += node.val;
                // if left or right child is not empty
                // then add them to queue
                if (node.left != null) {
                    leaves.offer(node.left);
                }
                if (node.right != null) {
                    leaves.offer(node.right);
                }
            }
        }
        return sum;
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
