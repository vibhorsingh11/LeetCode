package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_NthTribonacciNumberTest {

    private final Problem24_NthTribonacciNumber test = new Problem24_NthTribonacciNumber();

    @Test
    void tribonacci() {
        assertEquals(1389537, test.tribonacci(25));
    }
}