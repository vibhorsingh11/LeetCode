package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_LongestIncreasingSubsequenceTest {

    private final Problem09_LongestIncreasingSubsequence test = new Problem09_LongestIncreasingSubsequence();

    @Test
    void lengthOfLIS() {
        int[] arr = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, test.lengthOfLIS(arr));
    }
}