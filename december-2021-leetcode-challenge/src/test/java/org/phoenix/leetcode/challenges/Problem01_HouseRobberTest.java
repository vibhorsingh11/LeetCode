package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_HouseRobberTest {

    private final Problem01_HouseRobber test = new Problem01_HouseRobber();

    @Test
    void rob() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertEquals(4, test.rob(nums));
    }
}