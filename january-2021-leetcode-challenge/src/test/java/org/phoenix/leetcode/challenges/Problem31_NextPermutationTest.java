package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem31_NextPermutationTest {

    private final Problem31_NextPermutation test = new Problem31_NextPermutation();

    @Test
    void nextPermutation() {
        int[] arr = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 3, 2};
        assertArrayEquals(expected, test.nextPermutation(arr));
    }
}