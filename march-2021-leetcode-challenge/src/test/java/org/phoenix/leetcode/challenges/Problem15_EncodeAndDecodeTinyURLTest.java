package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.phoenix.leetcode.challenges.Problem15_EncodeAndDecodeTinyURL.Codec;

class Problem15_EncodeAndDecodeTinyURLTest {

    private final Codec test = new Codec();

    @Test
    void test() {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String encodedUrl = test.encode(longUrl);
        String decodedUrl = test.decode(encodedUrl);
        assertEquals(longUrl, decodedUrl);
    }

}