package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_MinimumOperationsToReduceXToZeroTest {

    private final Problem14_MinimumOperationsToReduceXToZero test = new Problem14_MinimumOperationsToReduceXToZero();

    @Test
    void minOperations() {
        int[] arr = new int[]{1, 1, 4, 2, 3};
        assertEquals(2, test.minOperations(arr, 5));
    }
}