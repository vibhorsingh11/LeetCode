package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_FindPeakElementTest {

    private final Problem13_FindPeakElement test = new Problem13_FindPeakElement();

    @Test
    void findPeakElement() {
        int[] arr = new int[]{1, 2, 1, 3, 5, 6, 4};
        assertEquals(5, test.findPeakElement(arr));
    }
}