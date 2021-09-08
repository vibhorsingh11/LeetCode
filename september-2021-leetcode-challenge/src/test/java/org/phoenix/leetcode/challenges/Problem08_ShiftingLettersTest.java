package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_ShiftingLettersTest {

    private final Problem08_ShiftingLetters test = new Problem08_ShiftingLetters();

    @Test
    void shiftingLetters() {
        int[] shifts = new int[]{3, 5, 9};
        assertEquals("rpl", test.shiftingLetters("abc", shifts));
    }
}