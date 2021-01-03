package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_BeautifulArrangementTest {

    private final Problem03_BeautifulArrangement test = new Problem03_BeautifulArrangement();

    @Test
    void countArrangement() {
        assertEquals(2, test.countArrangement(2));
    }
}