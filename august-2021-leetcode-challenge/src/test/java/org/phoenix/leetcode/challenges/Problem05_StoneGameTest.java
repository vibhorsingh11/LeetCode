package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem05_StoneGameTest {

    private final Problem05_StoneGame test = new Problem05_StoneGame();

    @Test
    void stoneGame() {
        int[] piles = new int[]{5, 3, 4, 5};
        assertTrue(test.stoneGame(piles));
    }
}