package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_UniqueEmailAddressesTest {

    private final Problem27_UniqueEmailAddresses test = new Problem27_UniqueEmailAddresses();

    @Test
    void numUniqueEmails() {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        assertEquals(2, test.numUniqueEmails(emails));
    }
}