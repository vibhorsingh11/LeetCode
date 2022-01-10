package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_AddBinaryTest {

    private final Problem10_AddBinary test = new Problem10_AddBinary();

    @Test
    void addBinary() {
        assertEquals("100", test.addBinary("11", "1"));
    }
}