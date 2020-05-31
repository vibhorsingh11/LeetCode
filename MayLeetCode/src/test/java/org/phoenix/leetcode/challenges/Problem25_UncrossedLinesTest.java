package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_UncrossedLinesTest {

    private final Problem25_UncrossedLines test = new Problem25_UncrossedLines();

    @Test
    void maxUncrossedLines() {
        int[] A = new int[]{1, 4, 2};
        int[] B = new int[]{1, 2, 4};

        assertEquals(2, test.maxUncrossedLines(A, B));
    }
}