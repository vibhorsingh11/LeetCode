package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem19_CombinationSumIVTest {

    private final Problem19_CombinationSumIV test = new Problem19_CombinationSumIV();

    @Test
    void combinationSum4() {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        assertEquals(7, test.combinationSum4(nums, target));

        nums = new int[]{9};
        target = 3;
        assertEquals(0, test.combinationSum4(nums, target));
    }
}