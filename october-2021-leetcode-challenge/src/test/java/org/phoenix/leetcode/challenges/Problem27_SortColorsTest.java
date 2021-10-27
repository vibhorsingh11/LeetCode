package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem27_SortColorsTest {

    private final Problem27_SortColors test = new Problem27_SortColors();

    @Test
    void sortColors() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};
            assertArrayEquals(expected, test.sortColors(nums));
    }
}