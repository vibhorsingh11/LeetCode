package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem29_CourseScheduleTest {

    private final Problem29_CourseSchedule test = new Problem29_CourseSchedule();

    @Test
    void canFinish() {
        int[][] arr = new int[][]{{1, 0}, {0, 1}};

        assertFalse(test.canFinish(2, arr));
    }
}