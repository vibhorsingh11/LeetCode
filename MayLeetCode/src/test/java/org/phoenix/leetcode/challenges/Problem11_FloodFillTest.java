package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem11_FloodFillTest {

    private final Problem11_FloodFill test = new Problem11_FloodFill();

    @Test
    void floodFill() {
        int[][] arr = new int[][]{{0, 0, 0}, {0, 1, 1}};
        int[][] excepted = new int[][]{{0, 0, 0}, {0, 1, 1}};
        assertEquals(arr, test.floodFill(arr, 1, 1, 1));
    }
}