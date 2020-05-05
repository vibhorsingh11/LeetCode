package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem04_NumberComplementTest {

    private final Problem04_NumberComplement test = new Problem04_NumberComplement();

    @Test
    void findComplement() {
        int except = 2, input = 5;
        int except1 = 0, input1 = 1;

        assertEquals(except,test.findComplement(input));
        assertEquals(except1,test.findComplement(input1));
    }
}