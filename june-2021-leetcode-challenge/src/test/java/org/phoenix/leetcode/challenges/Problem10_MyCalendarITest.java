package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem10_MyCalendarITest {

    @Test
    void book() {
        Problem10_MyCalendarI test = new Problem10_MyCalendarI();
        assertTrue(test.book(10, 20));
        assertFalse(test.book(15, 25));
        assertTrue(test.book(20, 30));
    }
}