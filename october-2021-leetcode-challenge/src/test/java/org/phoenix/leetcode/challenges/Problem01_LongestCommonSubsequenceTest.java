package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_LongestCommonSubsequenceTest {

    private final Problem01_LongestCommonSubsequence test = new Problem01_LongestCommonSubsequence();

    @Test
    void longestCommonSubsequence() {
        assertEquals(3, test.longestCommonSubsequence("abcde", "ace"));
    }
}