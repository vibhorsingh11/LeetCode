package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 2000].
 * -1000 <= Node.val <= 1000
 */

public class Problem20_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Result list
        List<List<Integer>> result = new ArrayList<>();
        // Base case
        if (root == null) {
            return result;
        }
        // Queue to store nodes
        Queue<TreeNode> queue = new LinkedList<>();
        // Adding root node
        queue.add(root);
        // Loop until queue is not empty
        while (!queue.isEmpty()) {
            // Current siz of queue
            int size = queue.size();
            // List to keep nodes at a level
            List<Integer> currentLevel = new ArrayList<>();
            // Loop till queue size
            while (size > 0) {
                // Remove front node
                TreeNode current = queue.remove();
                // add node to level list
                currentLevel.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
                size--;
            }
            // Adding list to level queue
            result.add(currentLevel);
        }
        return result;
    }
}
