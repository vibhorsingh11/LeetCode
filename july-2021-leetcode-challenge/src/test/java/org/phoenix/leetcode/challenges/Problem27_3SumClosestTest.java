package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_3SumClosestTest {

    private final Problem27_3SumClosest test = new Problem27_3SumClosest();

    @Test
    void threeSumClosest() {
        int[] nums = new int[]{-1, 2, 1, -4};
        assertEquals(2, test.threeSumClosest(nums, 1));
    }
}