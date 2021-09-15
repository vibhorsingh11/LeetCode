package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_LongestTurbulentSubarrayTest {

    private final Problem15_LongestTurbulentSubarray test = new Problem15_LongestTurbulentSubarray();

    @Test
    void maxTurbulenceSize() {
        int[] arr = new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9};
        assertEquals(5, test.maxTurbulenceSize(arr));
    }
}