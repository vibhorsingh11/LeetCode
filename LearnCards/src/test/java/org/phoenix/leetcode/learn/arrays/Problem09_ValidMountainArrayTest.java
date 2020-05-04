package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem09_ValidMountainArrayTest {

    private final Problem09_ValidMountainArray test = new Problem09_ValidMountainArray();

    @Test
    void validMountainArray() {
        int[] arr = new int[]{0, 3, 2, 1};

        assertTrue(test.validMountainArray(arr));

        int[] numbers = new int[]{3, 5, 5};
        assertFalse(test.validMountainArray(numbers));
    }
}