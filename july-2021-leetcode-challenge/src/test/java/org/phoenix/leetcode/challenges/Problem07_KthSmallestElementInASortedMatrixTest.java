package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_KthSmallestElementInASortedMatrixTest {

    private final Problem07_KthSmallestElementInASortedMatrix test = new Problem07_KthSmallestElementInASortedMatrix();

    @Test
    void kthSmallest() {
        int[][] matrix = new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        assertEquals(13, test.kthSmallest(matrix, 8));
    }
}