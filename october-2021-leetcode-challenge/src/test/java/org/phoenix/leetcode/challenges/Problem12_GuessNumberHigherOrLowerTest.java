package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_GuessNumberHigherOrLowerTest {

    private final Problem12_GuessNumberHigherOrLower test = new Problem12_GuessNumberHigherOrLower();

    @Test
    void guessNumber() {
        test.pick = 6;
        assertEquals(6, test.guessNumber(10));
    }
}