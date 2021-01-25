package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem25_CheckIfAll1sAreAtLeastLengthKPlacesAwayTest {

    private final Problem25_CheckIfAll1sAreAtLeastLengthKPlacesAway test = new Problem25_CheckIfAll1sAreAtLeastLengthKPlacesAway();

    @Test
    void kLengthApart() {
        int[] arr = new int[]{1, 0, 0, 0, 1, 0, 0, 1};
        assertTrue(test.kLengthApart(arr, 2));
    }
}