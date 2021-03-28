package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_ReconstructOriginalDigitsFromEnglishTest {

    private final Problem28_ReconstructOriginalDigitsFromEnglish test = new Problem28_ReconstructOriginalDigitsFromEnglish();

    @Test
    void originalDigits() {
        assertEquals("012", test.originalDigits("owoztneoer"));
    }
}