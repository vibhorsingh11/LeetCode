package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem11_MaximumPointsYouCanObtainFromCardsTest {

    private final Problem11_MaximumPointsYouCanObtainFromCards test = new Problem11_MaximumPointsYouCanObtainFromCards();

    @Test
    void maxScore() {
        int[] cardPoints = new int[]{1, 2, 3, 4, 5, 6, 1};
        assertEquals(12, test.maxScore(cardPoints, 3));
    }
}