package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_MinimumWindowSubstringTest {

    private final Problem15_MinimumWindowSubstring test = new Problem15_MinimumWindowSubstring();

    @Test
    void minWindow() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", test.minWindow(s, t));
    }
}