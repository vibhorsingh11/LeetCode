package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_DeleteOperationForTwoStringsTest {

    private final Problem07_DeleteOperationForTwoStrings test = new Problem07_DeleteOperationForTwoStrings();

    @Test
    void minDistance() {
        String word1 = "leetcode";
        String word2 = "etco";
        assertEquals(4, test.minDistance(word1, word2));
    }
}