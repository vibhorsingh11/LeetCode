package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_KthLargestElementInAnArrayTest {

    private final Problem16_KthLargestElementInAnArray test = new Problem16_KthLargestElementInAnArray();

    @Test
    void findKthLargest() {
        int[] arr = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        assertEquals(4, test.findKthLargest(arr, 4));
    }
}