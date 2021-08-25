package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem25_SumOfSquareNumbersTest {

    private final Problem25_SumOfSquareNumbers test = new Problem25_SumOfSquareNumbers();

    @Test
    void judgeSquareSum() {
        assertTrue(test.judgeSquareSum(5));

        assertFalse(test.judgeSquareSum(3));
    }
}