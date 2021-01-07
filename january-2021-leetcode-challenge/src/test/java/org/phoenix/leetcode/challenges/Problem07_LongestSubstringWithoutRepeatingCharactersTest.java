package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_LongestSubstringWithoutRepeatingCharactersTest {

    private final Problem07_LongestSubstringWithoutRepeatingCharacters test = new Problem07_LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, test.lengthOfLongestSubstring("abcabcbb"));

        assertEquals(1, test.lengthOfLongestSubstring("bbbbb"));
    }
}