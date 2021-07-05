package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem05_ReshapeTheMatrixTest {

    private final Problem05_ReshapeTheMatrix test = new Problem05_ReshapeTheMatrix();

    @Test
    void matrixReshape() {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int[][] expected = new int[][]{{1, 2, 3, 4}};
        assertArrayEquals(expected, test.matrixReshape(mat, 1, 4));
    }
}