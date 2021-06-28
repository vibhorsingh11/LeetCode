package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_RemoveAllAdjacentDuplicatesInStringTest {

    private final Problem28_RemoveAllAdjacentDuplicatesInString test = new Problem28_RemoveAllAdjacentDuplicatesInString();

    @Test
    void removeDuplicates() {
        String s = "abbaca";
        assertEquals("ca", test.removeDuplicates(s));
    }
}