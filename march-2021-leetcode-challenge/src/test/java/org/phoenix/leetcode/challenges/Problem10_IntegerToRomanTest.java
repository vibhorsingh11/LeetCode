package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_IntegerToRomanTest {

    private final Problem10_IntegerToRoman test = new Problem10_IntegerToRoman();

    @Test
    void intToRoman() {
        assertEquals("III", test.intToRoman(3));

        assertEquals("IV", test.intToRoman(4));

        assertEquals("LVIII", test.intToRoman(58));

        assertEquals("MCMXCIV", test.intToRoman(1994));
    }
}