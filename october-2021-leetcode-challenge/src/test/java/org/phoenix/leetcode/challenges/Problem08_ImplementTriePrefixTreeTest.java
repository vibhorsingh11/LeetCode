package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem08_ImplementTriePrefixTreeTest {

    @Test
    void insert() {
        Problem08_ImplementTriePrefixTree trie = new Problem08_ImplementTriePrefixTree();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
    }
}