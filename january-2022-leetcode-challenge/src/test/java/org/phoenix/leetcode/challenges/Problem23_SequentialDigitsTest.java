package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_SequentialDigitsTest {

    private final Problem23_SequentialDigits test = new Problem23_SequentialDigits();

    @Test
    void sequentialDigits() {
        List<Integer> output = Arrays.asList(123, 234);
        assertEquals(output, test.sequentialDigits(100, 300));
    }
}