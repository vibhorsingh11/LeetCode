package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem23_IntervalListIntersectionsTest {

    private final Problem23_IntervalListIntersections test = new Problem23_IntervalListIntersections();

    @Test
    void intervalIntersection() {
        int[][] A = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] B = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] res = new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};

        assertArrayEquals(res, test.intervalIntersection(A, B));
    }
}