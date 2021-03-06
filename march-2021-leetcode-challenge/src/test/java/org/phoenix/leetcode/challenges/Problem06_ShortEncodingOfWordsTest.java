package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem06_ShortEncodingOfWordsTest {

    private final Problem06_ShortEncodingOfWords test = new Problem06_ShortEncodingOfWords();

    @Test
    void minimumLengthEncoding() {
        String[] words = new String[]{"time", "me", "bell"};
        assertEquals(10, test.minimumLengthEncoding(words));
    }
}