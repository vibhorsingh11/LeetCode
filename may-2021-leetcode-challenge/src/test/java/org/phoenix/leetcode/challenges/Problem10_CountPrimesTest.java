package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_CountPrimesTest {

    private final Problem10_CountPrimes test = new Problem10_CountPrimes();

    @Test
    void countPrimes() {
        assertEquals(4, test.countPrimes(10));
        assertEquals(0, test.countPrimes(1));
    }
}