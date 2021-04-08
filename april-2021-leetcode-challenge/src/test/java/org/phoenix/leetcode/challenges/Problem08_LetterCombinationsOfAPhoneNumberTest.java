package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_LetterCombinationsOfAPhoneNumberTest {

    private final Problem08_LetterCombinationsOfAPhoneNumber test = new Problem08_LetterCombinationsOfAPhoneNumber();

    @Test
    void letterCombinations() {
        String digits = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, test.letterCombinations(digits));
    }
}