package org.phoenix.leetcode.challenges;

/**
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * <p>
 * Initially, all next pointers are set to NULL.
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 212 - 1].
 * -1000 <= Node.val <= 1000
 */

public class Problem29_PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null) return null;

        Node leftN = root.left;
        Node rightN = root.right;
        while (leftN != null) {
            leftN.next = rightN;
            leftN = leftN.right;
            rightN = rightN.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    static class Node {
        final int val;
        Node left;
        Node right;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
