package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_RomanToIntegerTest {

    private final Problem20_RomanToInteger test = new Problem20_RomanToInteger();

    @Test
    void romanToInt() {
        assertEquals(3, test.romanToInt("III"));
    }
}