package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_RemoveBoxesTest {

    private final Problem14_RemoveBoxes test = new Problem14_RemoveBoxes();

    @Test
    void removeBoxes() {
        int[] boxes = new int[]{1, 3, 2, 2, 2, 3, 4, 3, 1};
        assertEquals(23, test.removeBoxes(boxes));
    }
}