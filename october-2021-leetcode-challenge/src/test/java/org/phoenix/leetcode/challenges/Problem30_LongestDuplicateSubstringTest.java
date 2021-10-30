package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_LongestDuplicateSubstringTest {

    private final Problem30_LongestDuplicateSubstring test = new Problem30_LongestDuplicateSubstring();

    @Test
    void longestDupSubstring() {
        assertEquals("ana", test.longestDupSubstring("banana"));
    }
}