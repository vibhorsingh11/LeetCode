package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_OrderlyQueueTest {

    private final Problem05_OrderlyQueue test = new Problem05_OrderlyQueue();

    @Test
    void orderlyQueue() {
        String s = "cba";
        int k = 1;
        assertEquals("acb", test.orderlyQueue(s, k));
    }
}