package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_MultiplyStringsTest {

    private final Problem07_MultiplyStrings test = new Problem07_MultiplyStrings();

    @Test
    void multiply() {
        assertEquals("6", test.multiply("2", "3"));
    }
}