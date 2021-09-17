package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem17_IntersectionOfTwoArraysIITest {

    private final Problem17_IntersectionOfTwoArraysII test = new Problem17_IntersectionOfTwoArraysII();

    @Test
    void intersect() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] expected = new int[]{2, 2};
        assertArrayEquals(expected, test.intersect(nums1, nums2));
    }
}