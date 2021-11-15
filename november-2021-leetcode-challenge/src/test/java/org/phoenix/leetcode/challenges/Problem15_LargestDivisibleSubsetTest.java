package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_LargestDivisibleSubsetTest {

    private final Problem15_LargestDivisibleSubset test = new Problem15_LargestDivisibleSubset();

    @Test
    void largestDivisibleSubset() {
        int[] nums = new int[]{1,2,4,8};
        List<Integer> expected = Arrays.asList(1,2,4,8);
        assertEquals(expected, test.largestDivisibleSubset(nums));
    }
}