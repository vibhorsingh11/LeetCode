package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem23_SearchA2DMatrixIITest {

    private final Problem23_SearchA2DMatrixII test = new Problem23_SearchA2DMatrixII();

    @Test
    void searchMatrix() {
        int[][] arr = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        assertTrue(test.searchMatrix(arr, 5));
    }
}