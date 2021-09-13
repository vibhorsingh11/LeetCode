package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_MaximumNumberOfBalloonsTest {

    private final Problem13_MaximumNumberOfBalloons test = new Problem13_MaximumNumberOfBalloons();

    @Test
    void maxNumberOfBalloons() {
        String text = "nlaebolko";
        assertEquals(1, test.maxNumberOfBalloons(text));
    }
}