package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem12_PartitionEqualSubsetSumTest {

    private final Problem12_PartitionEqualSubsetSum test = new Problem12_PartitionEqualSubsetSum();

    @Test
    void canPartition() {
        int[] nums = new int[]{1, 5, 11, 5};
        assertTrue(test.canPartition(nums));

        nums = new int[]{1, 2, 3, 5};
        assertFalse(test.canPartition(nums));
    }
}