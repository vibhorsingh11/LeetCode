package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem03_SquaresSortedArrayTest {

    private final Problem03_SquaresSortedArray test = new Problem03_SquaresSortedArray();

    @Test
    void sortedSquares() {

        int[] arr = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};

        Assertions.assertArrayEquals(expected, test.sortedSquares(arr));
    }
}