package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem23_SortTheMatrixDiagonallyTest {

    private final Problem23_SortTheMatrixDiagonally test = new Problem23_SortTheMatrixDiagonally();

    @Test
    void sortDiagonal() {
        int[][] arr = new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] res = new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}};
        assertArrayEquals(res, test.diagonalSort(arr));
    }
}