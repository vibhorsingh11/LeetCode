package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem05_MergeSortedArrayTest {

    private final Problem05_MergeSortedArray test = new Problem05_MergeSortedArray();

    @Test
    void merge() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3, n = 3;
        int[] nums2 = new int[]{2, 5, 6};

        int[] expected = new int[]{1, 2, 2, 3, 5, 6};

        Assertions.assertArrayEquals(expected, test.merge(nums1, m, nums2, n));
    }
}