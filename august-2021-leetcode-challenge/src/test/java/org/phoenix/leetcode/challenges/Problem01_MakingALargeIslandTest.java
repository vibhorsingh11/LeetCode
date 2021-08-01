package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_MakingALargeIslandTest {

    private final Problem01_MakingALargeIsland test = new Problem01_MakingALargeIsland();

    @Test
    void largestIsland() {
        int[][] grid = new int[][]{
                {1, 0},
                {0, 1}
        };
        assertEquals(3, test.largestIsland(grid));
    }
}