package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem04_StreamOfCharactersTest {

    @Test
    void query() {
        String[] words = new String[]{"cd", "f", "kl"};
        Problem04_StreamOfCharacters test = new Problem04_StreamOfCharacters(words);
        assertFalse(test.query('a'));
        assertFalse(test.query('b'));
        assertFalse(test.query('c'));
        assertTrue(test.query('d'));
    }
}