package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_NumberOfSubarraysWithBoundedMaximumTest {

    private final Problem17_NumberOfSubarraysWithBoundedMaximum test = new Problem17_NumberOfSubarraysWithBoundedMaximum();

    @Test
    void numSubarrayBoundedMax() {
        int[] nums = new int[]{2, 1, 4, 3};
        assertEquals(3, test.numSubarrayBoundedMax(nums, 2, 3));
    }
}