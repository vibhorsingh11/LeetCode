package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_MaximumPerformanceOfATeamTest {

    private final Problem05_MaximumPerformanceOfATeam test = new Problem05_MaximumPerformanceOfATeam();

    @Test
    void maxPerformance() {
        int n = 6;
        int[] speed = new int[]{2, 10, 3, 1, 5, 8};
        int[] efficiency = new int[]{5, 4, 3, 9, 7, 2};
        int k = 2;
        assertEquals(60, test.maxPerformance(n, speed, efficiency, k));
    }
}