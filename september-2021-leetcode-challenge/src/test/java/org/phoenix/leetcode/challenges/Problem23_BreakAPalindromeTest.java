package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_BreakAPalindromeTest {

    private final Problem23_BreakAPalindrome test = new Problem23_BreakAPalindrome();

    @Test
    void breakPalindrome() {
        String palindrome = "abccba";
        assertEquals("aaccba", test.breakPalindrome(palindrome));
    }
}