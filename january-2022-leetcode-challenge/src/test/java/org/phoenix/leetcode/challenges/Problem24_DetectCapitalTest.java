package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem24_DetectCapitalTest {

    private final Problem24_DetectCapital test = new Problem24_DetectCapital();

    @Test
    void detectCapitalUse() {
        assertTrue(test.detectCapitalUse("USA"));
    }
}