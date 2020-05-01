package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem04_DuplicateZerosTest {

    private final Problem04_DuplicateZeros test = new Problem04_DuplicateZeros();

    @Test
    void duplicateZeros() {
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        int[] expected = new int[]{1, 0, 0, 2, 3, 0, 0, 4};

        Assertions.assertEquals(expected, test.duplicateZeros(arr));
    }
}