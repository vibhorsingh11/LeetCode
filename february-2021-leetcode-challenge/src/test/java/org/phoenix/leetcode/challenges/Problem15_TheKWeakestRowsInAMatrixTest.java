package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem15_TheKWeakestRowsInAMatrixTest {

    private final Problem15_TheKWeakestRowsInAMatrix test = new Problem15_TheKWeakestRowsInAMatrix();

    @Test
    void kWeakestRows() {
        int[][] matrix = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;
        int[] expected = new int[]{2, 0, 3};
        assertArrayEquals(expected, test.kWeakestRows(matrix, k));
    }
}