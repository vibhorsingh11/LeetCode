package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_WiggleSubsequenceTest {

    private final Problem18_WiggleSubsequence test = new Problem18_WiggleSubsequence();

    @Test
    void wiggleMaxLength() {
        int[] arr = new int[]{1, 7, 4, 9, 2, 5};
        assertEquals(6, test.wiggleMaxLength(arr));
    }
}