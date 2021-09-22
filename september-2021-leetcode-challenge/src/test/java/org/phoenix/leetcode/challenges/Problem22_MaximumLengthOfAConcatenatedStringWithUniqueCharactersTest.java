package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {

    private final Problem22_MaximumLengthOfAConcatenatedStringWithUniqueCharacters test = new Problem22_MaximumLengthOfAConcatenatedStringWithUniqueCharacters();

    @Test
    void maxLength() {
        List<String> arr = Arrays.asList("un", "iq", "ue");
        assertEquals(4, test.maxLength(arr));
    }
}