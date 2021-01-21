package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_FindMostCompetitiveSubsequenceTest {

    private final Problem21_FindMostCompetitiveSubsequence test = new Problem21_FindMostCompetitiveSubsequence();

    @Test
    void mostCompetitive() {
        int[] arr = new int[]{3, 5, 2, 6};
        int[] res = new int[]{2, 6};
        assertEquals(res, test.mostCompetitive(arr, 2));
    }
}