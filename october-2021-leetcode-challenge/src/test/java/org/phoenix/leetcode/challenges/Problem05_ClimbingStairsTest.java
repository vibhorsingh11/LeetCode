package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_ClimbingStairsTest {

    private final Problem05_ClimbingStairs test = new Problem05_ClimbingStairs();

    @Test
    void climbStairs() {
        assertEquals(2, test.climbStairs(2));
    }
}