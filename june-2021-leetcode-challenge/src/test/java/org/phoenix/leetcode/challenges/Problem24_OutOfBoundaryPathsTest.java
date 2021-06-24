package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_OutOfBoundaryPathsTest {

    private final Problem24_OutOfBoundaryPaths test = new Problem24_OutOfBoundaryPaths();

    @Test
    void findPaths() {
        int m = 2;
        int n = 2;
        int maxMove = 2;
        int startRow = 0;
        int startColumn = 0;
        assertEquals(6, test.findPaths(m, n, maxMove, startRow, startColumn));
    }
}