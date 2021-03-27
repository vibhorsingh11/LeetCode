package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_PalindromicSubstringsTest {

    private final Problem27_PalindromicSubstrings test = new Problem27_PalindromicSubstrings();

    @Test
    void countSubstrings() {
        assertEquals(3, test.countSubstrings("abc"));
        assertEquals(6, test.countSubstrings("aaa"));
    }
}