package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_WordLadderTest {

    private final Problem09_WordLadder test = new Problem09_WordLadder();

    @Test
    void ladderLength() {
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        assertEquals(5, test.ladderLength("hit", "cog", wordList));
    }
}