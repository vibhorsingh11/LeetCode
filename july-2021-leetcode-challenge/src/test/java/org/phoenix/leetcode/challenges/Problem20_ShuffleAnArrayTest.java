package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem20_ShuffleAnArrayTest {

    @Test
    void test() {
        int[] nums = {1, 2, 3};
        Problem20_ShuffleAnArray test = new Problem20_ShuffleAnArray(nums);
        assertNotNull(test.shuffle());
        assertArrayEquals(nums, test.reset());
    }
}