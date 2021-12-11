package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem11_NthMagicalNumberTest {

    private final Problem11_NthMagicalNumber test = new Problem11_NthMagicalNumber();

    @Test
    void nthMagicalNumber() {
        assertEquals(2, test.nthMagicalNumber(1, 2, 2));
    }
}