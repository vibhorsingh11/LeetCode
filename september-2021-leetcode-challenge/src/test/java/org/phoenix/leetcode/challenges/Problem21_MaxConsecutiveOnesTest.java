package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_MaxConsecutiveOnesTest {

    private final Problem21_MaxConsecutiveOnes test = new Problem21_MaxConsecutiveOnes();

    @Test
    void findMaxConsecutiveOnes() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        assertEquals(3, test.findMaxConsecutiveOnes(nums));
    }
}