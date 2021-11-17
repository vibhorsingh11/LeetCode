package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_UniquePathsTest {

    private final Problem17_UniquePaths test = new Problem17_UniquePaths();

    @Test
    void uniquePaths() {
        assertEquals(28, test.uniquePaths(3, 7));
    }
}