package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.phoenix.leetcode.learn.linkedlists.Problem03_LinkedListCycleII.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class Problem03_LinkedListCycleIITest {

    private final Problem03_LinkedListCycleII test = new Problem03_LinkedListCycleII();

    @Test
    void detectCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        Assertions.assertEquals(2,test.detectCycle(head).val);
        head.next.next.next.next = new ListNode(5);
        head.next.next = head;
        assertEquals(3, test.detectCycle(head).val);
    }
}