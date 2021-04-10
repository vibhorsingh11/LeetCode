package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_LongestIncreasingPathInAMatrixTest {

    private final Problem10_LongestIncreasingPathInAMatrix test = new Problem10_LongestIncreasingPathInAMatrix();

    @Test
    void longestIncreasingPath() {
        int[][] matrix = new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };
        assertEquals(4, test.longestIncreasingPath(matrix));
    }
}