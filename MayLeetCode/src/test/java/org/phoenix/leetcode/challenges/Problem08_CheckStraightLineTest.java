package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem08_CheckStraightLineTest {

    private final Problem08_CheckStraightLine test = new Problem08_CheckStraightLine();

    @Test
    void checkStraightLine() {
        int[][] arr = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        int[][] arr1 = new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        int[][] arr2 = new int[][]{{1, 1}, {2, 2}};

        assertTrue(test.checkStraightLine(arr));
        assertFalse(test.checkStraightLine(arr1));
    }
}