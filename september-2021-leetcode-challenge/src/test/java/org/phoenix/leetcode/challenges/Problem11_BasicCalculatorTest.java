package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_BasicCalculatorTest {

    private final Problem11_BasicCalculator test = new Problem11_BasicCalculator();

    @Test
    void calculate() {
        String s = "1 + 1";
        assertEquals(2, test.calculate(s));
    }
}