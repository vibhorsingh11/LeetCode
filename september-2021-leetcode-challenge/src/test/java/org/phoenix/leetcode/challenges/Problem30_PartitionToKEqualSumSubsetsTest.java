package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem30_PartitionToKEqualSumSubsetsTest {

    private final Problem30_PartitionToKEqualSumSubsets test = new Problem30_PartitionToKEqualSumSubsets();

    @Test
    void canPartitionKSubsets() {
        int[] nums = new int[]{4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        assertTrue(test.canPartitionKSubsets(nums, k));
    }
}