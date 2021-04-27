package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem27_PowerOfThreeTest {

    private final Problem27_PowerOfThree test = new Problem27_PowerOfThree();

    @Test
    void isPowerOfThree() {
        assertTrue(test.isPowerOfThree(27));
        assertFalse(test.isPowerOfThree(45));
    }
}