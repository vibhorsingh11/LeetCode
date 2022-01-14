package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_StringToIntegerTest {

    private final Problem14_StringToInteger test = new Problem14_StringToInteger();

    @Test
    void myAtoi() {
        assertEquals(42, test.MyAtoi("42"));
    }
}