package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_AddStringsTest {

    private final Problem09_AddStrings test = new Problem09_AddStrings();

    @Test
    void addStrings() {
        assertEquals("134", test.addStrings("11", "123"));
    }
}