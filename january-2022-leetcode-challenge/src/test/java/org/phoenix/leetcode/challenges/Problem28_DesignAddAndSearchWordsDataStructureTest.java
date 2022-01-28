package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem28_DesignAddAndSearchWordsDataStructureTest {

    @Test
    void addWord() {
        Problem28_DesignAddAndSearchWordsDataStructure wordDictionary = new Problem28_DesignAddAndSearchWordsDataStructure();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
    }
}