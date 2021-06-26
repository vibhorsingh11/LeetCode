package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_CountOfSmallerNumbersAfterSelfTest {

    private final Problem26_CountOfSmallerNumbersAfterSelf test = new Problem26_CountOfSmallerNumbersAfterSelf();

    @Test
    void countSmaller() {
        int[] nums = new int[]{5, 2, 6, 1};
        List<Integer> expected = Arrays.asList(2, 1, 1, 0);
        assertEquals(expected, test.countSmaller(nums));
    }
}