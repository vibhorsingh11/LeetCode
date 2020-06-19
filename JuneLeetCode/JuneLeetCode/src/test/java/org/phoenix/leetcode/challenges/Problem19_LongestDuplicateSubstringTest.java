package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_LongestDuplicateSubstringTest {

    private final Problem19_LongestDuplicateSubstring test = new Problem19_LongestDuplicateSubstring();

    @Test
    void longestDupSubstring() {
        assertEquals("ana", test.longestDupSubstring("banana"));
    }
}