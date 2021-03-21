package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem21_ReorderedPowerOf2Test {

    private final Problem21_ReorderedPowerOf2 test = new Problem21_ReorderedPowerOf2();

    @Test
    void reorderedPowerOf2() {
        assertTrue(test.reorderedPowerOf2(16));
        assertFalse(test.reorderedPowerOf2(24));
    }
}