package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_TwoCitySchedulingTest {

    private final Problem03_TwoCityScheduling test = new Problem03_TwoCityScheduling();

    @Test
    void twoCitySchedCost() {
        int[][] arr = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};

        assertEquals(110, test.twoCitySchedCost(arr));
    }
}