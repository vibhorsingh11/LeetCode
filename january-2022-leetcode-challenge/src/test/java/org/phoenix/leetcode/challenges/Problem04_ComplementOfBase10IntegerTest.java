package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_ComplementOfBase10IntegerTest {

    private final Problem04_ComplementOfBase10Integer test = new Problem04_ComplementOfBase10Integer();

    @Test
    void bitwiseComplement() {
        assertEquals(2, test.bitwiseComplement(5));
    }
}