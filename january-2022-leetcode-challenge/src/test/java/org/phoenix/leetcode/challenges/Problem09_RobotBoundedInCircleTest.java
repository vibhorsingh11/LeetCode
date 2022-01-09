package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem09_RobotBoundedInCircleTest {

    private final Problem09_RobotBoundedInCircle test = new Problem09_RobotBoundedInCircle();

    @Test
    void isRobotBounded() {
        assertTrue(test.isRobotBounded("GGLLGG"));
        assertFalse(test.isRobotBounded("GG"));
    }
}