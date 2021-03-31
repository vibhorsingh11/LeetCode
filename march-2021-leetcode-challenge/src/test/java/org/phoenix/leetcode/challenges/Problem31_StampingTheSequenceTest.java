package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem31_StampingTheSequenceTest {

    private final Problem31_StampingTheSequence test = new Problem31_StampingTheSequence();

    @Test
    void movesToStamp() {
        int[] res = new int[]{0,2};
        assertArrayEquals(res, test.movesToStamp("abc", "ababc"));
    }
}