package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_PeekingIteratorTest {

    @Test
    void peek() {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        Problem08_PeekingIterator test = new Problem08_PeekingIterator(iterator);
        assertEquals(1, test.peek());
    }
}