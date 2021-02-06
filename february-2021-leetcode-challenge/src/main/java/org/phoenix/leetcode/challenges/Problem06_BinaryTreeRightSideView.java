/*
* Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
* Example:
* Input: [1,2,3,null,5,null,4]
* Output: [1, 3, 4]
* Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
*/
package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem06_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int queueSize = queue.size();
            while (size > 0) {
                TreeNode head = queue.poll();
                if (size == queueSize) {
                    list.add(head.val);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
                if (head.left != null) {
                    queue.offer(head.left);
                }
                size--;
            }
        }
        return list;
    }
}
