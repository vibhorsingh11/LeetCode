package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_NumberOfMatchingSubsequencesTest {

    private final Problem22_NumberOfMatchingSubsequences test = new Problem22_NumberOfMatchingSubsequences();

    @Test
    void numMatchingSubseq() {
        String s = "abcde";
        String[] words = new String[]{"a", "bb", "acd", "ace"};
        assertEquals(3, test.numMatchingSubseq(s, words));
    }
}