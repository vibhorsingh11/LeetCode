package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_UniquePathsIIITest {

    private final Problem02_UniquePathsIII test = new Problem02_UniquePathsIII();

    @Test
    void uniquePathsIII() {
        int[][] grid = new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        assertEquals(2, test.uniquePathsIII(grid));
    }
}