package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_MaxConsecutiveOnesIIITest {

    private final Problem29_MaxConsecutiveOnesIII test = new Problem29_MaxConsecutiveOnesIII();

    @Test
    void longestOnes() {
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        assertEquals(6, test.longestOnes(nums, 2));

        nums = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        assertEquals(10, test.longestOnes(nums, 3));
    }
}