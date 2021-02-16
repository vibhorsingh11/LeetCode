package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_LetterCasePermutationTest {

    private final Problem16_LetterCasePermutation test = new Problem16_LetterCasePermutation();

    @Test
    void letterCasePermutation() {
        List<String> expected = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
        assertEquals(expected, test.letterCasePermutation("a1b2"));
    }
}