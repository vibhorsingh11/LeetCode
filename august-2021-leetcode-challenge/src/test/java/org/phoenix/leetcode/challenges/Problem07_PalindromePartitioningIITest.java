package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_PalindromePartitioningIITest {

    private final Problem07_PalindromePartitioningII test = new Problem07_PalindromePartitioningII();

    @Test
    void minCut() {
        assertEquals(1, test.minCut("aab"));
    }
}