package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem24_IntervalListIntersectionsTest {

    private final Problem24_IntervalListIntersections test = new Problem24_IntervalListIntersections();

    @Test
    void intervalIntersection() {
        int[][] firstList = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] expected = new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};
        assertArrayEquals(expected, test.intervalIntersection(firstList, secondList));
    }
}