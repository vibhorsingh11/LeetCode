package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem17_ThreeEqualPartsTest {

    private final Problem17_ThreeEqualParts test = new Problem17_ThreeEqualParts();

    @Test
    void threeEqualParts() {
        int[] nums = new int[]{1, 0, 1, 0, 1};
        int[] expected = new int[]{0, 3};
        assertArrayEquals(expected, test.threeEqualParts(nums));
    }
}