package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem08_TreeFromInorderAndPostorderTraversal.TreeNode;

class Problem08_TreeFromInorderAndPostorderTraversalTest {

    private final Problem08_TreeFromInorderAndPostorderTraversal test = new Problem08_TreeFromInorderAndPostorderTraversal();

    @Test
    void buildTree() {
        int[] inOrder = new int[]{9, 3, 15, 20, 7};
        int[] postOrder = new int[]{9, 15, 7, 20, 3};

        assertEquals(3, test.buildTree(inOrder, postOrder).val);
        assertEquals(9, test.buildTree(inOrder, postOrder).left.val);
        assertEquals(15, test.buildTree(inOrder, postOrder).right.left.val);
    }
}