package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_ReverseOnlyLettersTest {

    private final Problem14_ReverseOnlyLetters test = new Problem14_ReverseOnlyLetters();

    @Test
    void reverseOnlyLetters() {
        String s = "ab-cd";
        assertEquals("dc-ba", test.reverseOnlyLetters(s));
    }
}