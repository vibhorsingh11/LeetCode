package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in
 * ascending order.
 * Constraints:
 * <p>
 * The number of nodes in each tree is in the range [0, 5000].
 * -105 <= Node.val <= 105
 */

public class Problem26_AllElementsInTwoBinarySearchTrees {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        List<Integer> res = new ArrayList<>();

        while (root1 != null || root2 != null || !st1.empty() || !st2.empty()) {
            while (root1 != null) {
                st1.push(root1);
                root1 = root1.left;
            }
            while (root2 != null) {
                st2.push(root2);
                root2 = root2.left;
            }
            if (st2.empty() || (!st1.empty() && st1.peek().val <= st2.peek().val)) {
                root1 = st1.pop();
                res.add(root1.val);
                root1 = root1.right;
            } else {
                root2 = st2.pop();
                res.add(root2.val);
                root2 = root2.right;
            }
        }
        return res;
    }

    //Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
