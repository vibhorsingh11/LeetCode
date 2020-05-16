package org.phoenix.leetcode.learn.binarytree;

public class Problem11_NextRightPointersNodeII {

    public Node connect(Node root) {
        if (root == null) return null;

        // Connect curr node children if they exist
        if (root.left != null) root.left.next = root.right;

        // Find right most child of curr node
        Node rightMost = root.right != null ? root.right : root.left;

        // If curr node contains at least one child
        if (rightMost != null) {
            Node next = root.next;
            // While the curr node has next pointer, keep connecting their children
            while (next != null) {
                if (next.left != null) {
                    rightMost.next = next.left;
                    rightMost = rightMost.next;
                }
                if (next.right != null) {
                    rightMost.next = next.right;
                    rightMost = rightMost.next;
                }
                next = next.next;
            }
        }

        // Recurse through left & right children
        connect(root.left);
        connect(root.right);

        return root;
    }

    Node getNext(Node p) {
        Node temp = p.next;

        /* Traverse nodes at p's level and find and return
           the first node's first child */
        while (temp != null) {
            if (temp.left != null)
                return temp.left;
            if (temp.right != null)
                return temp.right;
            temp = temp.next;
        }

        // If all the nodes at p's level are leaf nodes then return NULL
        return null;
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
