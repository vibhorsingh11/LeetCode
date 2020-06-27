package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_PerfectSquaresTest {

    private final Problem27_PerfectSquares test = new Problem27_PerfectSquares();

    @Test
    void numSquares() {
        assertEquals(3, test.numSquares(12));
    }
}