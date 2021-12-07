package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem07_ConvertBinaryNumberInALinkedListToInteger.ListNode;

class Problem07_ConvertBinaryNumberInALinkedListToIntegerTest {

    private final Problem07_ConvertBinaryNumberInALinkedListToInteger test = new Problem07_ConvertBinaryNumberInALinkedListToInteger();

    @Test
    void getDecimalValue() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        assertEquals(5, test.getDecimalValue(head));
    }
}