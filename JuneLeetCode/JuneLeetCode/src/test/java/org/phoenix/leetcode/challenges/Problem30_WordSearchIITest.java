package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem30_WordSearchIITest {

    private final Problem30_WordSearchII test = new Problem30_WordSearchII();

    @Test
    void findWords() {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> expected = Arrays.asList("eat", "oath");
        assertEquals(expected, test.findWords(board, words));
    }
}