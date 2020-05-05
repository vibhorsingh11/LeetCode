package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem03_RansomNoteTest {

    private final Problem03_RansomNote test = new Problem03_RansomNote();

    @Test
    void canConstruct() {
        String ransomNote = "a", magazine = "b";
        String ransomNote1 = "aa", magazine1 = "ab";
        String ransomNote2 = "aa", magazine2 = "aab";

        assertFalse(test.canConstruct(ransomNote, magazine));
        assertFalse(test.canConstruct(ransomNote1, magazine1));
        assertTrue(test.canConstruct(ransomNote2, magazine2));
    }
}