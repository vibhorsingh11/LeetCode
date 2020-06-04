package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem04_ReverseStringTest {

    private final Problem04_ReverseString test = new Problem04_ReverseString();

    @Test
    void reverseString() {
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};

        assertArrayEquals(expected, test.reverseString(arr));
    }
}