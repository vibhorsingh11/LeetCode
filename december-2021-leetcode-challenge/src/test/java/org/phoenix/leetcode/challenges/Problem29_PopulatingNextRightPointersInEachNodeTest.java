package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem29_PopulatingNextRightPointersInEachNode.Node;

class Problem29_PopulatingNextRightPointersInEachNodeTest {

    private final Problem29_PopulatingNextRightPointersInEachNode test = new Problem29_PopulatingNextRightPointersInEachNode();

    @Test
    void connect() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node expected = test.connect(root);
        assertEquals(3, expected.left.next.val);
    }
}