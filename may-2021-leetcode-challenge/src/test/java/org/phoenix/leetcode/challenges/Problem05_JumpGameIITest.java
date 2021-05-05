package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_JumpGameIITest {

    private final Problem05_JumpGameII test = new Problem05_JumpGameII();

    @Test
    void jump() {
        int[] nums = new int[]{2, 3, 0, 1, 4};
        assertEquals(2, test.jump(nums));
    }
}