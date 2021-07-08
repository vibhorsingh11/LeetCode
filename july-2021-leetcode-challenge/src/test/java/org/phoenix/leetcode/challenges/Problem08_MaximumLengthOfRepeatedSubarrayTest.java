package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_MaximumLengthOfRepeatedSubarrayTest {

    private final Problem08_MaximumLengthOfRepeatedSubarray test = new Problem08_MaximumLengthOfRepeatedSubarray();

    @Test
    void findLength() {
        int[] nums1 = new int[]{1, 2, 3, 2, 1};
        int[] nums2 = new int[]{3, 2, 1, 4, 7};
        assertEquals(3, test.findLength(nums1, nums2));
    }
}