package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    private Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversal test = new Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    void buildTree() {
        int[] ino = new int[]{9, 3, 15, 20, 7};
        int[] po = new int[]{9, 3, 15, 20, 7};
        assertEquals(20, test.buildTree(ino, po).right.val);
        assertEquals(9, test.buildTree(ino, po).left.val);
    }
}