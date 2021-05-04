package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem04_NondecreasingArrayTest {

    private final Problem04_NondecreasingArray test = new Problem04_NondecreasingArray();

    @Test
    void checkPossibility() {
        int[] arr = new int[]{4, 2, 3};
        assertTrue(test.checkPossibility(arr));
    }
}