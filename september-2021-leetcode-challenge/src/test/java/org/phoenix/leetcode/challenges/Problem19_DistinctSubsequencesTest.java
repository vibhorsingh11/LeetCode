package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_DistinctSubsequencesTest {

    private final Problem19_DistinctSubsequences test = new Problem19_DistinctSubsequences();

    @Test
    void numDistinct() {
        String s = "rabbbit";
        String t = "rabbit";
        assertEquals(3, test.numDistinct(s, t));
    }
}