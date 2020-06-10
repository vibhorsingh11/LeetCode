package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_SearchInsertPositionTest {

    private final Problem10_SearchInsertPosition test = new Problem10_SearchInsertPosition();

    @Test
    void searchInsert() {
        int[] arr = new int[]{1, 3, 5, 6};
        assertEquals(4, test.searchInsert(arr, 7));
    }
}