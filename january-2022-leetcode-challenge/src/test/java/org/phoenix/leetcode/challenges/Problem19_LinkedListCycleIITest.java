package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem19_LinkedListCycleII.ListNode;

class Problem19_LinkedListCycleIITest {

    private final Problem19_LinkedListCycleII test = new Problem19_LinkedListCycleII();

    @Test
    void detectCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertEquals(2, test.detectCycle(head).val);
    }
}