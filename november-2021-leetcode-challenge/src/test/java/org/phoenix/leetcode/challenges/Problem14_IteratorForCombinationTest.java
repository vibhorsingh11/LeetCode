package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem14_IteratorForCombinationTest {

    @Test
    void next() {
        Problem14_IteratorForCombination test = new Problem14_IteratorForCombination("abc", 2);
        assertEquals("ab", test.next());
        assertTrue(test.hasNext());
        assertEquals("ac", test.next());
        assertTrue(test.hasNext());
        assertEquals("bc", test.next());
        assertFalse(test.hasNext());
    }
}