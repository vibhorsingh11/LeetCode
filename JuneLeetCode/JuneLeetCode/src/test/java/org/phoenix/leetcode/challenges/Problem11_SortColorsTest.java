package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem11_SortColorsTest {

    private final Problem11_SortColors test = new Problem11_SortColors();

    @Test
    void sortColors() {
        int[] arr = new int[]{2, 0, 2, 1, 1, 0};
        int[] nums = new int[]{0, 0, 1, 1, 2, 2};

        assertArrayEquals(nums, test.sortColors(arr));
    }
}