package org.phoenix.leetcode.challenges;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given an n-ary tree, return the level order traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
 * Constraints:
 * <p>
 * The height of the n-ary tree is less than or equal to 1000
 * The total number of nodes is between [0, 104]
 */

public class Problem06_NAryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        // Result List
        List<List<Integer>> result = new ArrayList<>();
        // Base case
        if (root == null) {
            return result;
        }
        Queue<Node> nQueue = new LinkedList<>();
        nQueue.add(root);
        // Looping until queue is not empty
        while (!nQueue.isEmpty()) {
            // Current level nodes
            List<Integer> currentLevel = new LinkedList<>();
            // Current queue size
            int size = nQueue.size();
            while (size-- > 0) {
                Node node = nQueue.poll();
                if (node != null) {
                    currentLevel.add(node.val);

                    List<Node> children = node.children;
                    if (children != null) {
                        nQueue.addAll(children);
                    }
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    // Definition for a Node.
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
