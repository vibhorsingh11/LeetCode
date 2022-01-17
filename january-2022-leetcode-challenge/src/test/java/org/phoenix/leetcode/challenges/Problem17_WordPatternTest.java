package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem17_WordPatternTest {

    private final Problem17_WordPattern test = new Problem17_WordPattern();

    @Test
    void wordPattern() {
        assertTrue(test.wordPattern("abba", "dog cat cat dog"));
    }
}