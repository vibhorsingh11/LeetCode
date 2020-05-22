package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem22_SortCharactersByFrequencyTest {

    private final Problem22_SortCharactersByFrequency test = new Problem22_SortCharactersByFrequency();

    @Test
    void frequencySort() {
        String s = "tree";

        assertEquals("eert", test.frequencySort(s));
    }
}