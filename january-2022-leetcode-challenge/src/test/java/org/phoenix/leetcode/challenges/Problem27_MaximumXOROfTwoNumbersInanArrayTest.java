package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_MaximumXOROfTwoNumbersInanArrayTest {

    private final Problem27_MaximumXOROfTwoNumbersInanArray test = new Problem27_MaximumXOROfTwoNumbersInanArray();

    @Test
    void findMaximumXOR() {
        int[] nums = new int[]{3, 10, 5, 25, 2, 8};
        assertEquals(28, test.findMaximumXOR(nums));
    }
}