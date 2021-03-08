package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_RemovePalindromicSubsequencesTest {

    private final Problem08_RemovePalindromicSubsequences test = new Problem08_RemovePalindromicSubsequences();

    @Test
    void removePalindromeSub() {
        assertEquals(1, test.removePalindromeSub("ababa"));

        assertEquals(2, test.removePalindromeSub("abb"));

        assertEquals(2, test.removePalindromeSub("baabb"));
    }
}