package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_WordLadderIITest {

    private final Problem24_WordLadderII test = new Problem24_WordLadderII();

    @Test
    void findLadders() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("hit", "hot", "dot", "dog", "cog"));
        expected.add(Arrays.asList("hit", "hot", "lot", "log", "cog"));
        assertEquals(expected, test.findLadders(beginWord, endWord, wordList));
    }
}