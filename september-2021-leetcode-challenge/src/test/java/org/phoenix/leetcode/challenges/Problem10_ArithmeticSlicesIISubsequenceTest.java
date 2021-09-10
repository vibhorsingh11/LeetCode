package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_ArithmeticSlicesIISubsequenceTest {

    private final Problem10_ArithmeticSlicesIISubsequence test = new Problem10_ArithmeticSlicesIISubsequence();

    @Test
    void numberOfArithmeticSlices() {
        int[] nums = new int[]{2, 4, 6, 8, 10};
        assertEquals(7, test.numberOfArithmeticSlices(nums));
    }
}