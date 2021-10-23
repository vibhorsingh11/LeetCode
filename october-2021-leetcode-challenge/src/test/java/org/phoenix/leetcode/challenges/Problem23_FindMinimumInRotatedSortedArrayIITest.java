package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_FindMinimumInRotatedSortedArrayIITest {

    private final Problem23_FindMinimumInRotatedSortedArrayII test = new Problem23_FindMinimumInRotatedSortedArrayII();

    @Test
    void findMin() {
        int[] num = new int[]{1,3,5};
        assertEquals(1, test.findMin(num));
    }
}