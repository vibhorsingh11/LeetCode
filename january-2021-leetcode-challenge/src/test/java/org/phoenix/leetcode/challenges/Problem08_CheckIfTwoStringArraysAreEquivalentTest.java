package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem08_CheckIfTwoStringArraysAreEquivalentTest {

    private final Problem08_CheckIfTwoStringArraysAreEquivalent test = new Problem08_CheckIfTwoStringArraysAreEquivalent();

    @Test
    void arrayStringsAreEqual() {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        assertTrue(test.arrayStringsAreEqual(word1, word2));
    }
}