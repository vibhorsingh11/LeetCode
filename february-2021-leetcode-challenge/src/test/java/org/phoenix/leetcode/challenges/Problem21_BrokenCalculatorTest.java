package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_BrokenCalculatorTest {

    private final Problem21_BrokenCalculator test = new Problem21_BrokenCalculator();

    @Test
    void brokenCalc() {
        assertEquals(2, test.brokenCalc(2,3));

        assertEquals(2, test.brokenCalc(5,8));
        assertEquals(3, test.brokenCalc(3,10));
    }
}