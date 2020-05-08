package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem01_PreorderTraversal.TreeNode;

import java.util.Arrays;
import java.util.List;

class Problem01_PreorderTraversalTest {

    private final Problem01_PreorderTraversal test = new Problem01_PreorderTraversal();

    @Test
    void preorderTraversal() {
        TreeNode n = new TreeNode(1);
        n.right = new TreeNode(2);
        n.right.left = new TreeNode(3);

        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, test.preorderTraversal(n));
    }
}