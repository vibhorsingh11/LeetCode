package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem22_VowelSpellcheckerTest {

    private final Problem22_VowelSpellchecker test = new Problem22_VowelSpellchecker();

    @Test
    void spellchecker() {
        String[] wordList = {"KiTe", "kite", "hare", "Hare"};
        String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};
        String[] expected = {"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"};
        assertArrayEquals(expected, test.spellchecker(wordList, queries));
    }
}