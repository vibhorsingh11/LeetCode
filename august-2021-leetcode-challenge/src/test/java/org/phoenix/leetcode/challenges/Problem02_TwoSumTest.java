package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem02_TwoSumTest {

    private final Problem02_TwoSum test = new Problem02_TwoSum();

    @Test
    void twoSum() {
        int[] arr = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, test.twoSum(arr, 9));
    }
}