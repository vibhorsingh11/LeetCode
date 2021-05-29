package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_NQueensIITest {

    private final Problem29_NQueensII test = new Problem29_NQueensII();

    @Test
    void totalNQueens() {
        assertEquals(2, test.totalNQueens(4));
    }
}