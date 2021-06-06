package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_LongestConsecutiveSequenceTest {

    private final Problem06_LongestConsecutiveSequence test = new Problem06_LongestConsecutiveSequence();

    @Test
    void longestConsecutive() {
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        assertEquals(9, test.longestConsecutive(nums));
    }
}