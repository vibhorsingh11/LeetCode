package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_EditDistanceTest {

    private final Problem31_EditDistance test = new Problem31_EditDistance();

    @Test
    void minDistance() {
        String word1 = "horse";
        String word2 = "ros";

        assertEquals(3, test.minDistance(word1, word2));
    }
}