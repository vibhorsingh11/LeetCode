package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_PowerfulIntegersTest {

    private final Problem30_PowerfulIntegers test = new Problem30_PowerfulIntegers();

    @Test
    void powerfulIntegers() {
        List<Integer> expected = Arrays.asList(2,3,4,5,7,9,10);
        assertEquals(expected, test.powerfulIntegers(2, 3, 10));
    }
}