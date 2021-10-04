package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_IslandPerimeterTest {

    private final Problem04_IslandPerimeter test = new Problem04_IslandPerimeter();

    @Test
    void islandPerimeter() {
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        assertEquals(16, test.islandPerimeter(grid));
    }
}