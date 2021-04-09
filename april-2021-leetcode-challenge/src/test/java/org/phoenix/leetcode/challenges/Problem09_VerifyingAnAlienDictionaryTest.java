package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem09_VerifyingAnAlienDictionaryTest {

    private final Problem09_VerifyingAnAlienDictionary test = new Problem09_VerifyingAnAlienDictionary();

    @Test
    void isAlienSorted() {
        String[] words = new String[]{"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(test.isAlienSorted(words, order));
    }
}