package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_MinimumValueToGetPositiveStepByStepSumTest {

    private final Problem11_MinimumValueToGetPositiveStepByStepSum test = new Problem11_MinimumValueToGetPositiveStepByStepSum();

    @Test
    void minStartValue() {
        int[] nums = new int[]{-3, 2, -3, 4, 2};
        assertEquals(5, test.minStartValue(nums));
    }
}