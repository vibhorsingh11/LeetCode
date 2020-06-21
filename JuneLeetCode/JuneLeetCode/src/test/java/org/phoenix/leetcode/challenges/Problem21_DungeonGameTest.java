package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_DungeonGameTest {

    private final Problem21_DungeonGame test = new Problem21_DungeonGame();

    @Test
    void calculateMinimumHP() {
        int[][] arr = new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        assertEquals(7, test.calculateMinimumHP(arr));
    }
}