package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_RottingOrangesTest {

    private final Problem29_RottingOranges test = new Problem29_RottingOranges();

    @Test
    void orangesRotting() {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, test.orangesRotting(grid));
    }
}