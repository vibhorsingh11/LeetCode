package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_RemoveKDigitsTest {

    private final Problem13_RemoveKDigits test = new Problem13_RemoveKDigits();

    @Test
    void removeKdigits() {
        assertEquals("1219", test.removeKdigits("1432219", 3));
    }
}