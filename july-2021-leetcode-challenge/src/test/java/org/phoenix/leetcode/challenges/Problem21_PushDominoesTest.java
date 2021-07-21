package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_PushDominoesTest {

    private final Problem21_PushDominoes test = new Problem21_PushDominoes();

    @Test
    void pushDominoes() {
        assertEquals("RR.L", test.pushDominoes("RR.L"));
    }
}