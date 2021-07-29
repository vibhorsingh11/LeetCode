package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem29_01_MatrixTest {

    private final Problem29_01_Matrix test = new Problem29_01_Matrix();

    @Test
    void updateMatrix() {
        int[][] matrix = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
        assertArrayEquals(expected, test.updateMatrix(matrix));
    }
}