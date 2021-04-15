package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_FibonacciNumberTest {

    private final Problem15_FibonacciNumber test = new Problem15_FibonacciNumber();

    @Test
    void fib() {
        assertEquals(1, test.fib(2));
        assertEquals(2, test.fib(3));
        assertEquals(3, test.fib(4));
    }
}