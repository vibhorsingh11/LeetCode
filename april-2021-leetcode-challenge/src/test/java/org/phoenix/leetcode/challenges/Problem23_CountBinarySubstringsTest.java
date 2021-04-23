package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_CountBinarySubstringsTest {

    private final Problem23_CountBinarySubstrings test = new Problem23_CountBinarySubstrings();

    @Test
    void countBinarySubstrings() {
        assertEquals(6, test.countBinarySubstrings("00110011"));
        assertEquals(4, test.countBinarySubstrings("10101"));
    }
}