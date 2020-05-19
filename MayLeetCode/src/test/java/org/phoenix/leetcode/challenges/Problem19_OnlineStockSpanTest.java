package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem19_OnlineStockSpanTest {

    private final Problem19_OnlineStockSpan test = new Problem19_OnlineStockSpan();

    @Test
    void next() {
        assertEquals(1, test.next(100));
        assertEquals(1, test.next(80));
        assertEquals(1, test.next(60));
        assertEquals(2, test.next(70));
        assertEquals(1, test.next(60));
        assertEquals(4, test.next(75));
        assertEquals(6, test.next(85));
    }
}