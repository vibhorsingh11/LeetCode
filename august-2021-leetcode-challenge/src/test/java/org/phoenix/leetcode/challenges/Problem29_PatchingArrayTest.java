package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_PatchingArrayTest {

    private final Problem29_PatchingArray test = new Problem29_PatchingArray();

    @Test
    void minPatches() {
        int[] nums = new int[]{1, 3};
        assertEquals(1, test.minPatches(nums, 6));
    }
}