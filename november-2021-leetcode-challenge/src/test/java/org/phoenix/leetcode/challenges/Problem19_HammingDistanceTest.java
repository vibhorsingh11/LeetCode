package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_HammingDistanceTest {

    private final Problem19_HammingDistance test = new Problem19_HammingDistance();

    @Test
    void hammingDistance() {
        assertEquals(2, test.hammingDistance(1, 4));
    }
}