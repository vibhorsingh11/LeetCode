package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem05_GlobalAndLocalInversionsTest {

    private final Problem05_GlobalAndLocalInversions test = new Problem05_GlobalAndLocalInversions();

    @Test
    void isIdealPermutation() {
        int[] arr = new int[]{1, 0, 2};
        assertTrue(test.isIdealPermutation(arr));
    }
}