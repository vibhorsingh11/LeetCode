package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_SmallestIntegerDivisibleByKTest {

    private final Problem30_SmallestIntegerDivisibleByK test = new Problem30_SmallestIntegerDivisibleByK();

    @Test
    void smallestRepunitDivByK() {
        assertEquals(1, test.smallestRepunitDivByK(1));
    }
}