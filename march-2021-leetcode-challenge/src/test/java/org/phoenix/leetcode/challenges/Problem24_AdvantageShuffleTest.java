package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem24_AdvantageShuffleTest {

    private final Problem24_AdvantageShuffle test = new Problem24_AdvantageShuffle();

    @Test
    void advantageCount() {
        int[] A = new int[]{2, 7, 11, 15};
        int[] B = new int[]{1, 10, 4, 11};
        int[] expected = new int[]{2, 11, 7, 15};
        assertArrayEquals(expected, test.advantageCount(A, B));
    }
}