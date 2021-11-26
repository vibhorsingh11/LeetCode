package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_SearchInsertPositionTest {

    private final Problem26_SearchInsertPosition test = new Problem26_SearchInsertPosition();

    @Test
    void searchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(2, test.searchInsert(nums, 5));
    }
}