package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_ComplexNumberMultiplicationTest {

    private final Problem24_ComplexNumberMultiplication test = new Problem24_ComplexNumberMultiplication();

    @Test
    void complexNumberMultiply() {
        assertEquals("0+2i", test.complexNumberMultiply("1+1i", "1+1i"));
    }
}