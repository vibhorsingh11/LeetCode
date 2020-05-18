package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem01_DesignCircularQueueTest {

    private final Problem01_DesignCircularQueue test = new Problem01_DesignCircularQueue(3);

    @Test
    void enQueue() {

        assertTrue(test.enQueue(1));
        assertTrue(test.enQueue(2));
        assertTrue(test.enQueue(3));
        assertFalse(test.enQueue(4));
        assertEquals(3, test.Rear());
        assertTrue(test.isFull());
        assertTrue(test.deQueue());
        assertTrue(test.enQueue(4));
        assertEquals(4, test.Rear());
    }

}