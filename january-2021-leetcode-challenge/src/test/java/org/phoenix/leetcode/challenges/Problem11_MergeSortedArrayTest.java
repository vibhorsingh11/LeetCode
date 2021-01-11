package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem11_MergeSortedArrayTest {

    private final Problem11_MergeSortedArray test = new Problem11_MergeSortedArray();

    @Test
    void merge() {
        int[] arr1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6};
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        int[] actual = test.merge(arr1, 3, arr2, 3);
        assertArrayEquals(expected, actual);
    }
}