package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_SingleElementInSortedArrayTest {

    private final Problem12_SingleElementInSortedArray test = new Problem12_SingleElementInSortedArray();

    @Test
    void singleNonDuplicate() {
        int[] arr = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};

        assertEquals(2, test.singleNonDuplicate(arr));
    }
}