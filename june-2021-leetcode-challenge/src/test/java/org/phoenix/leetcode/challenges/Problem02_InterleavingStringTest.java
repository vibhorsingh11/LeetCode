package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem02_InterleavingStringTest {

    private final Problem02_InterleavingString test = new Problem02_InterleavingString();

    @Test
    void isInterleave() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        assertTrue(test.isInterleave(s1, s2, s3));
    }
}