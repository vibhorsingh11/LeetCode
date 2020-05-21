package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem03_OpenTheLockTest {

    private final Problem03_OpenTheLock test = new Problem03_OpenTheLock();

    @Test
    void openLock() {
        String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";

        assertEquals(6, test.openLock(deadends, target));
    }
}