package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.learn.binarytree.Problem02_InorderTraversal.TreeNode;

import java.util.Arrays;
import java.util.List;

class Problem02_InorderTraversalTest {

    private final Problem02_InorderTraversal test = new Problem02_InorderTraversal();

    @Test
    void inorderTraversal() {
        TreeNode n = new TreeNode(1);
        n.right = new TreeNode(2);
        n.right.left = new TreeNode(3);

        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, test.inorderTraversal(n));
    }
}