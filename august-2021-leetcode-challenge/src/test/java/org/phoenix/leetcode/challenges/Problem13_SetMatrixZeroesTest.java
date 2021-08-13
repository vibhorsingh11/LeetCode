package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem13_SetMatrixZeroesTest {

    private final Problem13_SetMatrixZeroes test = new Problem13_SetMatrixZeroes();

    @Test
    void setZeroes() {
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] expected = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        assertArrayEquals(expected, test.setZeroes(matrix));
    }
}