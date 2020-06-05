package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_RandomPickWithWeightTest {

    @Test
    void pickIndex() {
        int[] arr = new int[]{1, 3};
        Problem05_RandomPickWithWeight test = new Problem05_RandomPickWithWeight(arr);
        assertEquals(1, test.pickIndex());
    }
}