package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem01_MaxConsecutiveOnesTest {

    private final Problem01_MaxConsecutiveOnes test = new Problem01_MaxConsecutiveOnes();

    @Test
    void findMaxConsecutiveOnes() {
        int[] nums = {1, 1, 0, 1, 1, 1};

        Assertions.assertEquals(3, test.findMaxConsecutiveOnes(nums));
    }
}