package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_ShortestPathInAGridWithObstaclesEliminationTest {

    private final Problem25_ShortestPathInAGridWithObstaclesElimination test =
            new Problem25_ShortestPathInAGridWithObstaclesElimination();

    @Test
    void shortestPath() {
        int[][] grid = new int[][]{
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 0}
        };
        int k = 1;
        assertEquals(6, test.shortestPath(grid, k));
    }
}