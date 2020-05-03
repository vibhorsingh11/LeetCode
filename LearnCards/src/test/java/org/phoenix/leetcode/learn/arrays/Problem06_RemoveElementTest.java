package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem06_RemoveElementTest {

    private final Problem06_RemoveElement test = new Problem06_RemoveElement();

    @Test
    void removeElement() {
        int[] arr = new int[]{3, 2, 2, 3};
        int val = 3;

        Assertions.assertEquals(2, test.removeElement(arr, val));

        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int k = 2;

        Assertions.assertEquals(5, test.removeElement(nums, k));
    }
}