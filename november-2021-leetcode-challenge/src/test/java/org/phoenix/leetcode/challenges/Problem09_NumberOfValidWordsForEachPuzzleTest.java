package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_NumberOfValidWordsForEachPuzzleTest {

    private final Problem09_NumberOfValidWordsForEachPuzzle test = new Problem09_NumberOfValidWordsForEachPuzzle();

    @Test
    void findNumOfValidWords() {
        String[] words = new String[]{"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = new String[]{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        List<Integer> expected = Arrays.asList(1, 1, 3, 2, 4, 0);
        assertEquals(expected, test.findNumOfValidWords(words, puzzles));
    }
}