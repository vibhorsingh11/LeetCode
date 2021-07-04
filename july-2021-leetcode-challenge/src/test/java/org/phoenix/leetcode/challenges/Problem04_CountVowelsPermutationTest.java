package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_CountVowelsPermutationTest {

    private final Problem04_CountVowelsPermutation test = new Problem04_CountVowelsPermutation();

    @Test
    void countVowelPermutation() {
        assertEquals(5, test.countVowelPermutation(1));
    }
}