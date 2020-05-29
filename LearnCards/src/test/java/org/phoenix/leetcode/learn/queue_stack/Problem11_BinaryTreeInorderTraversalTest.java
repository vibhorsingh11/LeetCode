package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.learn.queue_stack.Problem11_BinaryTreeInorderTraversal.TreeNode;

import java.util.Arrays;
import java.util.List;

class Problem11_BinaryTreeInorderTraversalTest {

    private final Problem11_BinaryTreeInorderTraversal test = new Problem11_BinaryTreeInorderTraversal();

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> list = Arrays.asList(1, 3, 2);

        assertEquals(list, test.inorderTraversal(root));
    }
}