package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem12_SortArrayByParityTest {

    private final Problem12_SortArrayByParity test = new Problem12_SortArrayByParity();

    @Test
    void sortArrayByParity() {
        int[] arr = new int[]{3, 1, 2, 4};
        int[] output = new int[]{2, 4, 3, 1};

        assertArrayEquals(output, test.sortArrayByParity(arr));
    }
}