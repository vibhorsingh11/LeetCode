package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem03_MaxSumOfRectangleNoLargerThanKTest {

    private final Problem03_MaxSumOfRectangleNoLargerThanK test = new Problem03_MaxSumOfRectangleNoLargerThanK();

    @Test
    void maxSumSubmatrix() {
        int[][] matrix = new int[][]{
                {1, 0, 1},
                {0, -2, 3}
        };
        int k = 2;
        assertEquals(2, test.maxSumSubmatrix(matrix, k));
    }
}