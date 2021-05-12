package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_RangeSumQuery2DImmutableTest {

    @Test
    void sumRegion() {
        int[][] matrix = new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        Problem12_RangeSumQuery2DImmutable test = new Problem12_RangeSumQuery2DImmutable(matrix);
        assertEquals(8, test.sumRegion(2, 1, 4, 3));
        assertEquals(11, test.sumRegion(1, 1, 2, 2));
        assertEquals(12, test.sumRegion(1, 2, 2, 4));
    }
}