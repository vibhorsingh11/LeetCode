package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_GetMaximumInGeneratedArrayTest {

    private final Problem15_GetMaximumInGeneratedArray test = new Problem15_GetMaximumInGeneratedArray();

    @Test
    void getMaximumGenerated() {
        assertEquals(3, test.getMaximumGenerated(7));
    }
}