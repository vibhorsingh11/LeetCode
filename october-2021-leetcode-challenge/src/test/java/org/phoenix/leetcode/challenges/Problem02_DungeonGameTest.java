package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_DungeonGameTest {

    private final Problem02_DungeonGame test = new Problem02_DungeonGame();

    @Test
    void calculateMinimumHP() {
        int[][] dungeon  = new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}};
        assertEquals(7, test.calculateMinimumHP(dungeon));
    }
}