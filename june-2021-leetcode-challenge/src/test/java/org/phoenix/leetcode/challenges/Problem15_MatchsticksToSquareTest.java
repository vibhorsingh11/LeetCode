package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem15_MatchsticksToSquareTest {

    private final Problem15_MatchsticksToSquare test = new Problem15_MatchsticksToSquare();

    @Test
    void makesquare() {
        int[] matchsticks = new int[]{1, 1, 2, 2, 2};
        assertTrue(test.makesquare(matchsticks));
    }
}