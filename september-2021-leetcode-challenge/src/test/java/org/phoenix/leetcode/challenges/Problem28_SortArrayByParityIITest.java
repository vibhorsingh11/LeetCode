package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem28_SortArrayByParityIITest {

    private final Problem28_SortArrayByParityII test = new Problem28_SortArrayByParityII();

    @Test
    void sortArrayByParityII() {
        int[] nums = new int[]{4, 2, 5, 7};
        int[] expected = new int[]{4, 5, 2, 7};
        assertArrayEquals(expected, test.sortArrayByParityII(nums));
    }
}