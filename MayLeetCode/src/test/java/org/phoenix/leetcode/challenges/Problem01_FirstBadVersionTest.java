package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem01_FirstBadVersionTest {

    private final Problem01_FirstBadVersion test = new Problem01_FirstBadVersion();

    @Test
    void firstBadVersion() {

        assertEquals(4, test.firstBadVersion(5, 4));
        assertEquals(3, test.firstBadVersion(8, 3));
        assertEquals(4, test.firstBadVersion(4, 4));
    }
}