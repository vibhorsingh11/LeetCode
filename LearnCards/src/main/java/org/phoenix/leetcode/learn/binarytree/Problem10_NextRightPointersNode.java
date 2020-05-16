package org.phoenix.leetcode.learn.binarytree;

public class Problem10_NextRightPointersNode {

    public Node connect(Node root) {
        // if root is null
        if (root == null) return null;
        // new nodes for left and right
        Node leftN = root.left;
        Node rightN = root.right;
        // looping over left if it is not null
        while (leftN != null) {
            // connecting next of left to right
            leftN.next = rightN;
            // updating left & right node for checking left subtree
            leftN = leftN.right;
            rightN = rightN.left;
        }
        // recursively calling left and right subtree nodes
        connect(root.left);
        connect(root.right);
        return root;
    }

    // Definition for a Node.
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(int _val) {
            val = _val;
        }
    }
}
