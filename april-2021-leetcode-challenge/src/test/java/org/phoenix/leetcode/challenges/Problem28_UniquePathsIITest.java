package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_UniquePathsIITest {

    private final Problem28_UniquePathsII test = new Problem28_UniquePathsII();

    @Test
    void uniquePathsWithObstacles() {
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        assertEquals(2, test.uniquePathsWithObstacles(obstacleGrid));
    }
}