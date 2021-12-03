package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_MaximumProductSubarrayTest {

    private final Problem03_MaximumProductSubarray test = new Problem03_MaximumProductSubarray();

    @Test
    void maxProduct() {
        int[] nums = new int[]{2, 3, -2, 4};
        assertEquals(6, test.maxProduct(nums));
    }
}