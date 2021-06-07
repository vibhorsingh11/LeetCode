package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_MinCostClimbingStairsTest {

    private final Problem07_MinCostClimbingStairs test = new Problem07_MinCostClimbingStairs();

    @Test
    void minCostClimbingStairs() {
        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, test.minCostClimbingStairs(cost));
    }
}