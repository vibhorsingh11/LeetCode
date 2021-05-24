package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_ToLowerCaseTest {

    private final Problem24_ToLowerCase test = new Problem24_ToLowerCase();

    @Test
    void toLowerCase() {
        assertEquals("hello", test.toLowerCase("Hello"));
        assertEquals("lovely", test.toLowerCase("LOVELY"));
    }
}