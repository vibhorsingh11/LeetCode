package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem03_RunningSumOf1dArrayTest {

    private final Problem03_RunningSumOf1dArray test = new Problem03_RunningSumOf1dArray();

    @Test
    void runningSum() {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] result = new int[]{1, 3, 6, 10};
        assertArrayEquals(result, test.runningSum(arr));
    }
}