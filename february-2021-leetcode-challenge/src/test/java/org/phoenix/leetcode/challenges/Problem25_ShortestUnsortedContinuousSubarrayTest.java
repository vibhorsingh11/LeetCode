package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_ShortestUnsortedContinuousSubarrayTest {

    private final Problem25_ShortestUnsortedContinuousSubarray test = new Problem25_ShortestUnsortedContinuousSubarray();

    @Test
    void findUnsortedSubarray() {
        int[] arr = new int[]{2, 6, 4, 8, 10, 9, 15};
        assertEquals(5, test.findUnsortedSubarray(arr));
    }
}