package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem14_ImplementTrieTest {

    private final Problem14_ImplementTrie test = new Problem14_ImplementTrie();

    @Test
    void insert() {
        test.insert("apple");
        assertTrue(test.search("apple"));   // returns true
        assertFalse(test.search("app"));     // returns false
        assertTrue(test.startsWith("app")); // returns true
        test.insert("app");
        assertTrue(test.search("app"));     // returns true
    }
}