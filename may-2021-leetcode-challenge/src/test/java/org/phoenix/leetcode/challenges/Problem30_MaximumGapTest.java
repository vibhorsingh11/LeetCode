package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_MaximumGapTest {

    private final Problem30_MaximumGap test = new Problem30_MaximumGap();

    @Test
    void maximumGap() {
        int[] nums = new int[]{3, 6, 9, 1};
        assertEquals(3, test.maximumGap(nums));
    }
}