package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_PartitionArrayIntoDisjointIntervalsTest {

    private final Problem22_PartitionArrayIntoDisjointIntervals test =
            new Problem22_PartitionArrayIntoDisjointIntervals();

    @Test
    void partitionDisjoint() {
        int[] nums = new int[]{5, 0, 3, 8, 6};
        assertEquals(3, test.partitionDisjoint(nums));
    }
}