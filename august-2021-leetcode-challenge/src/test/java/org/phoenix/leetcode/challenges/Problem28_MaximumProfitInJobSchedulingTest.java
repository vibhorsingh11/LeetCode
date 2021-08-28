package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_MaximumProfitInJobSchedulingTest {

    private final Problem28_MaximumProfitInJobScheduling test = new Problem28_MaximumProfitInJobScheduling();

    @Test
    void jobScheduling() {
        int[] startTime = new int[]{1, 2, 3, 3};
        int[] endTime = new int[]{3, 4, 5, 6};
        int[] profit = new int[]{50, 10, 40, 70};
        assertEquals(120, test.jobScheduling(startTime, endTime, profit));
    }
}