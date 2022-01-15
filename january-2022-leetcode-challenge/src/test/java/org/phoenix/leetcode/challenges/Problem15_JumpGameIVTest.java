package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_JumpGameIVTest {

    private final Problem15_JumpGameIV test = new Problem15_JumpGameIV();

    @Test
    void minJumps() {
        int[] arr = new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        assertEquals(3, test.minJumps(arr));
    }
}