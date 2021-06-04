package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_OpenTheLockTest {

    private final Problem04_OpenTheLock test = new Problem04_OpenTheLock();

    @Test
    void openLock() {
        String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        assertEquals(6, test.openLock(deadends, target));
    }
}