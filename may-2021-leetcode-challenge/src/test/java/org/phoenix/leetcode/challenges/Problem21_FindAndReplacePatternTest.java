package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem21_FindAndReplacePatternTest {

    private final Problem21_FindAndReplacePattern test = new Problem21_FindAndReplacePattern();

    @Test
    void findAndReplacePattern() {
        String[] words = new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        String[] expected = new String[]{"mee", "aqq"};
        List<String> list = test.findAndReplacePattern(words, pattern);
        assertArrayEquals(expected, list.toArray());
    }
}