package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_ReverseWordsInAStringTest {

    private final Problem20_ReverseWordsInAString test = new Problem20_ReverseWordsInAString();

    @Test
    void reverseWords() {
        String s = "  Bob    Loves  Alice   ";
        String output = "Alice Loves Bob";
        assertEquals(output, test.reverseWords(s));
    }
}