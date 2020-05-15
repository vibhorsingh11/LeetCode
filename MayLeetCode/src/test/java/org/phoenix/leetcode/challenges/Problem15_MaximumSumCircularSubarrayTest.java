package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem15_MaximumSumCircularSubarrayTest {

    private final Problem15_MaximumSumCircularSubarray test = new Problem15_MaximumSumCircularSubarray();

    @Test
    void maxSubarraySumCircular() {
        int[] arr = new int[]{1, -2, 3, -2};

        assertEquals(3, test.maxSubarraySumCircular(arr));
    }
}