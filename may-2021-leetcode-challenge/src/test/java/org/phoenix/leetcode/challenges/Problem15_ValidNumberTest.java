package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem15_ValidNumberTest {

    private final Problem15_ValidNumber test = new Problem15_ValidNumber();

    @Test
    void isNumber() {
        assertTrue(test.isNumber("0"));
        assertFalse(test.isNumber("e"));
    }
}