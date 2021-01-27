package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_ConcatenationOfConsecutiveNumbersTest {

    private final Problem27_ConcatenationOfConsecutiveNumbers test = new Problem27_ConcatenationOfConsecutiveNumbers();

    @Test
    void concatenatedBinary() {
        assertEquals(27, test.concatenatedBinary(3));
    }
}