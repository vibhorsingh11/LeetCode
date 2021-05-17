package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_LongestStringChainTest {

    private final Problem17_LongestStringChain test = new Problem17_LongestStringChain();

    @Test
    void longestStrChain() {
        String[] words = new String[]{"a", "b", "ba", "bca", "bda", "bdca"};
        assertEquals(4, test.longestStrChain(words));
    }
}