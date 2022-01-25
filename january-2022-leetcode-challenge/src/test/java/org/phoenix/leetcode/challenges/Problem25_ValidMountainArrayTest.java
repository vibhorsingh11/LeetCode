package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem25_ValidMountainArrayTest {

    private final Problem25_ValidMountainArray test = new Problem25_ValidMountainArray();

    @Test
    void validMountainArray() {
        int[] arr = new int[]{0, 3, 2, 1};
        assertTrue(test.validMountainArray(arr));
    }
}