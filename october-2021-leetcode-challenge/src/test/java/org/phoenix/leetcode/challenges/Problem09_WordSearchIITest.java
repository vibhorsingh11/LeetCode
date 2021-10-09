package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_WordSearchIITest {

    private final Problem09_WordSearchII test = new Problem09_WordSearchII();

    @Test
    void findWords() {
        char[][] board = new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = new String[]{"oath", "pea", "eat", "rain"};
        List<String> expected = Arrays.asList("oath", "eat");
        assertEquals(expected, test.findWords(board, words));
    }
}