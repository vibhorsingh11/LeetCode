package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_SuperPalindromesTest {

    private final Problem08_SuperPalindromes test = new Problem08_SuperPalindromes();

    @Test
    void superpalindromesInRange() {
        String left = "4";
        String right = "1000";
        assertEquals(4, test.superpalindromesInRange(left,right));
    }
}