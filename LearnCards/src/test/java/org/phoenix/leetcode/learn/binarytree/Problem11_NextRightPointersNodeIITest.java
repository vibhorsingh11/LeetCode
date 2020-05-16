package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.phoenix.leetcode.learn.binarytree.Problem11_NextRightPointersNodeII.Node;

class Problem11_NextRightPointersNodeIITest {

    private final Problem11_NextRightPointersNodeII test = new Problem11_NextRightPointersNodeII();

    @Test
    void connect() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        Node root1 = new Node(1);
        root1.left = new Node(1);

//        assertEquals(3, test.connect(root).left.next.val);
        assertNull(test.connect(root1).left.next);
    }
}