package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem24_MergeIntervalsTest {

    private final Problem24_MergeIntervals test = new Problem24_MergeIntervals();

    @Test
    void merge() {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, test.merge(intervals));
    }
}