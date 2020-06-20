package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_PermutationSequenceTest {

    private final Problem20_PermutationSequence test = new Problem20_PermutationSequence();

    @Test
    void getPermutation() {
        assertEquals("213", test.getPermutation(3, 3));
    }
}