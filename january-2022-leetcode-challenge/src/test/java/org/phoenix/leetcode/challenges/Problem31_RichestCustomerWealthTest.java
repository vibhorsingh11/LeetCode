package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_RichestCustomerWealthTest {

    private final Problem31_RichestCustomerWealth test = new Problem31_RichestCustomerWealth();

    @Test
    void maximumWealth() {
        int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
        assertEquals(6, test.maximumWealth(accounts));
    }
}