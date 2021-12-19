package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_DecodeStringTest {

    private final Problem19_DecodeString test = new Problem19_DecodeString();

    @Test
    void decodeString() {
        String s = "3[a]2[bc]";
        assertEquals("aaabcbc", test.decodeString(s));
    }
}