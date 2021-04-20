package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
 * <p>
 * Example 1:
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [1,3,5,6,2,4]
 * Example 2:
 * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
 * <p>
 * Constraints:
 * The number of nodes in the tree is in the range [0, 104].
 * 0 <= Node.val <= 104
 * The height of the n-ary tree is less than or equal to 1000.
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */

public class Problem20_NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        // Result list
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        // Stack to store tree elements
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        // loop until stack is empty
        while (!nodeStack.isEmpty()) {
            // Get the top node from stack
            Node node = nodeStack.pop();
            list.add(node.val);
            // get child list from the top node
            List<Node> children = node.children;
            if (children != null) {
                for (int i = children.size() - 1; i >= 0; i--) {
                    nodeStack.push(children.get(i));
                }
            }
        }
        return list;
    }
}

// Definition for a Node.
class Node {
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
