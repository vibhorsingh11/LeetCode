package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_InsertDeleteGetRandomTest {

    private final Problem21_InsertDeleteGetRandom test = new Problem21_InsertDeleteGetRandom();

    @Test
    void insert() {
        assertTrue(test.insert(1));
        assertFalse(test.remove(2));
        assertTrue(test.insert(2));
        assertEquals(1,test.getRandom());
    }
}