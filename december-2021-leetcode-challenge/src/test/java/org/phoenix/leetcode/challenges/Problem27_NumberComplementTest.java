package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_NumberComplementTest {

    private final Problem27_NumberComplement test = new Problem27_NumberComplement();

    @Test
    void findComplement() {
        assertEquals(2, test.findComplement(5));
    }
}