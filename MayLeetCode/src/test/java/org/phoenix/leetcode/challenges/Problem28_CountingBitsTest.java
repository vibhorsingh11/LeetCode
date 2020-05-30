package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem28_CountingBitsTest {

    private final Problem28_CountingBits test = new Problem28_CountingBits();

    @Test
    void countBits() {
        int[] expected = new int[]{0, 1, 1, 2, 1, 2};

        assertArrayEquals(expected, test.countBits(5));
    }
}