package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem09_ValidPerfectSquareTest {

    private final Problem09_ValidPerfectSquare test = new Problem09_ValidPerfectSquare();

    @Test
    void isPerfectSquare() {
        int num = 16;
        int num1 = 14;

        assertTrue(test.isPerfectSquare(num));
        assertFalse(test.isPerfectSquare(num1));
    }
}