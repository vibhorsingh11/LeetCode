package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem05_MinStackTest {

    private final Problem05_MinStack test = new Problem05_MinStack();

    @Test
    void push() {
        test.push(-2);
        test.push(0);
        test.push(-3);
        assertEquals(-3, test.getMin());
        test.pop();
        assertEquals(0, test.top());
        assertEquals(-2, test.getMin());
    }

}