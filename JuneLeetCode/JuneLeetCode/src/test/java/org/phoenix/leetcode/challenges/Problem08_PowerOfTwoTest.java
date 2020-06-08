package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem08_PowerOfTwoTest {

    private final Problem08_PowerOfTwo test = new Problem08_PowerOfTwo();

    @Test
    void isPowerOfTwo() {
        assertTrue(test.isPowerOfTwo(16));
    }
}