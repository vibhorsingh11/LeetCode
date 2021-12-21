package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem21_PowerOfTwoTest {

    private final Problem21_PowerOfTwo test = new Problem21_PowerOfTwo();

    @Test
    void isPowerOfTwo() {
        assertTrue(test.isPowerOfTwo(16));
    }
}