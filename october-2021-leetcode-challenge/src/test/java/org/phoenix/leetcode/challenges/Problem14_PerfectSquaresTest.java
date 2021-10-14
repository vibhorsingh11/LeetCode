package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_PerfectSquaresTest {

    private final Problem14_PerfectSquares test = new Problem14_PerfectSquares();

    @Test
    void numSquares() {
        assertEquals(3, test.numSquares(12));
    }
}