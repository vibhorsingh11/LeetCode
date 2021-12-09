package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem09_JumpGameIIITest {

    private final Problem09_JumpGameIII test = new Problem09_JumpGameIII();

    @Test
    void canReach() {
        int[] arr = new int[]{4, 2, 3, 0, 3, 1, 2};
        assertTrue(test.canReach(arr, 0));
    }
}