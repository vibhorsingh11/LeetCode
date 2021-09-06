package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_SlowestKeyTest {

    private final Problem06_SlowestKey test = new Problem06_SlowestKey();

    @Test
    void slowestKey() {
        int[] releaseTimes = new int[]{9, 29, 49, 50};
        String keysPressed = "cbcd";
        assertEquals('c', test.slowestKey(releaseTimes, keysPressed));
    }
}