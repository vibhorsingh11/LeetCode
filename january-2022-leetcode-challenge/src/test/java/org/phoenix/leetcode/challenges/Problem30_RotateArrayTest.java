package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem30_RotateArrayTest {

    private final Problem30_RotateArray test = new Problem30_RotateArray();

    @Test
    void rotate() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected, test.rotate(nums, 3));
    }
}