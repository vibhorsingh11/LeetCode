package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_CountSortedVowelStringsTest {

    private final Problem17_CountSortedVowelStrings test = new Problem17_CountSortedVowelStrings();

    @Test
    void countVowelStrings() {
        assertEquals(5, test.countVowelStrings(1));

        assertEquals(15, test.countVowelStrings(2));

        assertEquals(66045, test.countVowelStrings(33));
    }
}