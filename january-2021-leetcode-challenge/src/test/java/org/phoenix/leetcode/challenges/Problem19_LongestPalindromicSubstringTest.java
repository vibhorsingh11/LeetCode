package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_LongestPalindromicSubstringTest {

    private final Problem19_LongestPalindromicSubstring test = new Problem19_LongestPalindromicSubstring();

    @Test
    void longestPalindrome() {
        String s = "babad";
        String result = "aba";
        assertEquals(result, test.longestPalindrome(s));
    }
}