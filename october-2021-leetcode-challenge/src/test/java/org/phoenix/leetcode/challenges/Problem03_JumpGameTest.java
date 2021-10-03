package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem03_JumpGameTest {

    private final Problem03_JumpGame test = new Problem03_JumpGame();

    @Test
    void canJump() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        assertTrue(test.canJump(nums));

        nums = new int[]{3, 2, 1, 0, 4};
        assertFalse(test.canJump(nums));
    }
}