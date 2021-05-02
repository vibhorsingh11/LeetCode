package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_CourseScheduleIIITest {

    private final Problem02_CourseScheduleIII test = new Problem02_CourseScheduleIII();

    @Test
    void scheduleCourse() {
        int[][] courses = new int[][]{{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        assertEquals(3, test.scheduleCourse(courses));
    }
}