package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem07_DetermineIfStringHalvesAreAlikeTest {

    private final Problem07_DetermineIfStringHalvesAreAlike test = new Problem07_DetermineIfStringHalvesAreAlike();

    @Test
    void halvesAreAlike() {
        assertTrue(test.halvesAreAlike("book"));
    }
}