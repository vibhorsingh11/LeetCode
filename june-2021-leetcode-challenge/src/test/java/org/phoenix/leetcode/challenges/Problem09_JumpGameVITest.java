package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_JumpGameVITest {

    private final Problem09_JumpGameVI test = new Problem09_JumpGameVI();

    @Test
    void maxResult() {
        int[] nums = new int[]{1, -1, -2, 4, -7, 3};
        int k = 2;
        assertEquals(7, test.maxResult(nums, k));
    }
}