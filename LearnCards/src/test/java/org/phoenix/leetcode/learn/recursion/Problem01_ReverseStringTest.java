package org.phoenix.leetcode.learn.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem01_ReverseStringTest {

    private final Problem01_ReverseString test = new Problem01_ReverseString();

    @Test
    void reverseString() {
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] output = new char[]{'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(output, test.reverseString(input));
    }
}