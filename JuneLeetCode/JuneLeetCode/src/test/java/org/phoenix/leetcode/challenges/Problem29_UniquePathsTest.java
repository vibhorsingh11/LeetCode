package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_UniquePathsTest {

    private final Problem29_UniquePaths test = new Problem29_UniquePaths();

    @Test
    void uniquePaths() {
        assertEquals(28, test.uniquePaths(7, 3));
    }
}