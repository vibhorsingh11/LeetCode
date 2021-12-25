package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_BasicCalculatorIITest {

    private final Problem25_BasicCalculatorII test = new Problem25_BasicCalculatorII();

    @Test
    void calculate() {
        assertEquals(7, test.calculate("3+2*2"));
    }
}