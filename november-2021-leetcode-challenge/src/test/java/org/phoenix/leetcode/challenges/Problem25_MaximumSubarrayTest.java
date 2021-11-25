package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_MaximumSubarrayTest {

    private final Problem25_MaximumSubarray test = new Problem25_MaximumSubarray();

    @Test
    void maxSubArray() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, test.maxSubArray(nums));
    }
}