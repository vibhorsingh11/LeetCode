package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem03_PostorderTraversal.TreeNode;

import java.util.Arrays;
import java.util.List;

class Problem03_PostorderTraversalTest {

    private final Problem03_PostorderTraversal test = new Problem03_PostorderTraversal();

    @Test
    void postorderTraversal() {
        TreeNode n = new TreeNode(1);
        n.right = new TreeNode(2);
        n.right.left = new TreeNode(3);

        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertEquals(expected, test.postorderTraversal(n));
    }
}