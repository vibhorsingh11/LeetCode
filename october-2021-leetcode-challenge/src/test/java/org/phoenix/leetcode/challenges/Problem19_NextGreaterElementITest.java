package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem19_NextGreaterElementITest {

    private final Problem19_NextGreaterElementI test = new Problem19_NextGreaterElementI();

    @Test
    void nextGreaterElement() {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        int[] expected = new int[]{-1, 3, -1};
        assertArrayEquals(expected, test.nextGreaterElement(nums1, nums2));
    }
}