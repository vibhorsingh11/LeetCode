package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_DecodeWaysTest {

    private final Problem18_DecodeWays test = new Problem18_DecodeWays();

    @Test
    void numDecodings() {
        assertEquals(2, test.numDecodings("12"));
        assertEquals(3, test.numDecodings("226"));
    }
}