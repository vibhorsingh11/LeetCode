package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem10_NextRightPointersNode.Node;

class Problem10_NextRightPointersNodeTest {

    private final Problem10_NextRightPointersNode test = new Problem10_NextRightPointersNode();

    @Test
    void connect() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        assertEquals(3, test.connect(root).left.next.val);
    }
}