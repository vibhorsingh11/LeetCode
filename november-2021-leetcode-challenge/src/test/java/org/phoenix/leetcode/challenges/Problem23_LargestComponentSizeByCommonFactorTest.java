package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_LargestComponentSizeByCommonFactorTest {

    private final Problem23_LargestComponentSizeByCommonFactor test = new Problem23_LargestComponentSizeByCommonFactor();

    @Test
    void largestComponentSize() {
        int[] nums = new int[]{2, 3, 6, 7, 4, 12, 21, 39};
        assertEquals(8, test.largestComponentSize(nums));
    }
}