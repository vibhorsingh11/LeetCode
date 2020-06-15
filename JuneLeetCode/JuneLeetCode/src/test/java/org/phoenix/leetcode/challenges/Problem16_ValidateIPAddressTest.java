package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_ValidateIPAddressTest {

    private final Problem16_ValidateIPAddress test = new Problem16_ValidateIPAddress();

    @Test
    void validIPAddress() {
        assertEquals("IPv4", test.validIPAddress("172.16.254.1"));
    }
}