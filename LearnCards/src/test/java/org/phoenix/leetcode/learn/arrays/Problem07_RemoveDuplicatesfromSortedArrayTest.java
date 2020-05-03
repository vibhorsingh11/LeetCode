package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem07_RemoveDuplicatesfromSortedArrayTest {

    private final Problem07_RemoveDuplicatesfromSortedArray test = new Problem07_RemoveDuplicatesfromSortedArray();

    @Test
    void removeDuplicates() {
        int[] arr = new int[]{1, 1, 2};

        Assertions.assertEquals(2, test.removeDuplicates(arr));

        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        Assertions.assertEquals(5, test.removeDuplicates(nums));
    }
}