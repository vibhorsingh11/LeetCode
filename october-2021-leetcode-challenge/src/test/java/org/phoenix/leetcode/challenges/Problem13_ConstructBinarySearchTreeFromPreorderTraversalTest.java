package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_ConstructBinarySearchTreeFromPreorderTraversalTest {

    private final Problem13_ConstructBinarySearchTreeFromPreorderTraversal test = new Problem13_ConstructBinarySearchTreeFromPreorderTraversal();

    @Test
    void bstFromPreorder() {
        int[] arr = new int[]{8, 5, 1, 7, 10, 12};

        assertEquals(1, test.bstFromPreorder(arr).left.left.val);
    }
}