package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem12_InsertDeleteGetRandomTest {

    private final Problem12_InsertDeleteGetRandom test = new Problem12_InsertDeleteGetRandom();

    @Test
    void insert() {
        assertTrue(test.insert(1));
        assertFalse(test.remove(2));
        assertTrue(test.insert(2));
        assertEquals(2,test.getRandom());
    }
}