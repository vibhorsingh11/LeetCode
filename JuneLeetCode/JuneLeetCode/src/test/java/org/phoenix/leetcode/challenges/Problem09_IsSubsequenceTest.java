package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem09_IsSubsequenceTest {

    private final Problem09_IsSubsequence test = new Problem09_IsSubsequence();

    @Test
    void isSubsequence() {
        assertTrue(test.isSubsequence("abc", "ahbgdc"));
    }
}