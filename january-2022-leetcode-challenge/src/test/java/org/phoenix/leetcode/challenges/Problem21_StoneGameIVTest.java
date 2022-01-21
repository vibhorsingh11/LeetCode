package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem21_StoneGameIVTest {

    private final Problem21_StoneGameIV test = new Problem21_StoneGameIV();

    @Test
    void winnerSquareGame() {
        assertTrue(test.winnerSquareGame(1));
        assertFalse(test.winnerSquareGame(2));
    }
}