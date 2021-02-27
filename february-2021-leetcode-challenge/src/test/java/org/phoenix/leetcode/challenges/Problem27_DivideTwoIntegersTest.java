package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_DivideTwoIntegersTest {

    private final Problem27_DivideTwoIntegers test = new Problem27_DivideTwoIntegers();

    @Test
    void divide() {
        assertEquals(-2, test.divide(7, -3));
    }
}