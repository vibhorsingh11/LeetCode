package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem23_CourseScheduleIITest {

    private final Problem23_CourseScheduleII test = new Problem23_CourseScheduleII();

    @Test
    void findOrder() {
        int[][] prerequisites = new int[][]{{1, 0}};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, test.findOrder(2, prerequisites));
    }
}