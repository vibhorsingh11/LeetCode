package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_DecodeWaysIITest {

    private final Problem10_DecodeWaysII test = new Problem10_DecodeWaysII();

    @Test
    void numDecodings() {
        assertEquals(18, test.numDecodings("1*"));
    }
}