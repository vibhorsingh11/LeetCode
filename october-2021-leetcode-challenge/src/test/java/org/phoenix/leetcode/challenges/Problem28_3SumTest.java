package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_3SumTest {

    private final Problem28_3Sum test = new Problem28_3Sum();

    @Test
    void threeSum() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        assertEquals(expected, test.threeSum(nums));
    }
}