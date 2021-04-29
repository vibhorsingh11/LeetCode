package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem29_FindFirstAndLastPositionOfElementInSortedArrayTest {

    private final Problem29_FindFirstAndLastPositionOfElementInSortedArray test = new Problem29_FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    void searchRange() {
        int[] arr = new int[]{5, 7, 7, 8, 8, 10};
        int[] res = new int[]{3, 4};
        assertArrayEquals(res, test.searchRange(arr, 8));
    }
}