package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_PathWithMinimumEffortTest {

    private final Problem26_PathWithMinimumEffort test = new Problem26_PathWithMinimumEffort();

    @Test
    void minimumEffortPath() {
        int[][] arr = new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        assertEquals(2, test.minimumEffortPath(arr));
    }
}