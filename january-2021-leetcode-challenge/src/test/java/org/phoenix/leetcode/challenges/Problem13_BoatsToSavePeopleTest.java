package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_BoatsToSavePeopleTest {

    private final Problem13_BoatsToSavePeople test = new Problem13_BoatsToSavePeople();

    @Test
    void numRescueBoats() {
        int[] people = new int[]{1, 2};
        assertEquals(1, test.numRescueBoats(people, 3));
    }
}