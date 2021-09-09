package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_LargestPlusSignTest {

    private final Problem09_LargestPlusSign test = new Problem09_LargestPlusSign();

    @Test
    void orderOfLargestPlusSign() {
        int[][] mines = new int[][]{{4, 2}};
        assertEquals(2, test.orderOfLargestPlusSign(5, mines));
    }
}