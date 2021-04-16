package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_RemoveAllAdjacentDuplicatesInStringIITest {

    private final Problem16_RemoveAllAdjacentDuplicatesInStringII test = new Problem16_RemoveAllAdjacentDuplicatesInStringII();

    @Test
    void removeDuplicates() {
        assertEquals("abcd", test.removeDuplicates("abcd", 2));
        assertEquals("aa", test.removeDuplicates("deeedbbcccbdaa", 3));
        assertEquals("ps", test.removeDuplicates("pbbcggttciiippooaais", 2));
    }
}