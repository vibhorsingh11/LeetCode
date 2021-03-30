package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_RussianDollEnvelopesTest {

    private final Problem30_RussianDollEnvelopes test = new Problem30_RussianDollEnvelopes();

    @Test
    void maxEnvelopes() {
        int[][] arr = new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        assertEquals(3, test.maxEnvelopes(arr));
    }
}