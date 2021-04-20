package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Problem20_NaryTreePreorderTraversalTest {

    private final Problem20_NaryTreePreorderTraversal test = new Problem20_NaryTreePreorderTraversal();

    @Test
    void preorder() {
        Node root = new Node(1, Arrays.asList(new Node(3, Arrays.asList(new Node(5), new Node(6))), new Node(2, null), new Node(4, null)));
        System.out.println(test.preorder(root));
    }
}