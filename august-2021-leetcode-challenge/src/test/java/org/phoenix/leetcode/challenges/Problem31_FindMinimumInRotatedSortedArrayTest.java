package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_FindMinimumInRotatedSortedArrayTest {

    private final Problem31_FindMinimumInRotatedSortedArray test = new Problem31_FindMinimumInRotatedSortedArray();

    @Test
    void findMin() {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        assertEquals(1, test.findMin(nums));
    }
}