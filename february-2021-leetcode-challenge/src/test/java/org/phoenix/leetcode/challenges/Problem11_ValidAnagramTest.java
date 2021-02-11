package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem11_ValidAnagramTest {

    private final Problem11_ValidAnagram test = new Problem11_ValidAnagram();

    @Test
    void isAnagram() {
        String s = "anagram";
        String t = "nagaram";

        assertTrue(test.isAnagram(s, t));
    }
}