package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_LongestHarmoniousSubsequenceTest {

    private final Problem04_LongestHarmoniousSubsequence test = new Problem04_LongestHarmoniousSubsequence();

    @Test
    void findLHS() {
        int[] arr = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        assertEquals(5, test.findLHS(arr));

        int[] arr1 = new int[]{1, 2, 3, 4};
        assertEquals(2, test.findLHS(arr1));
    }
}