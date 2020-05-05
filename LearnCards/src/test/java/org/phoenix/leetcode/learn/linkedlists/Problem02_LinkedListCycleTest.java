package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.phoenix.leetcode.learn.linkedlists.Problem02_LinkedListCycle.ListNode;

class Problem02_LinkedListCycleTest {

    private final Problem02_LinkedListCycle test = new Problem02_LinkedListCycle();

    @Test
    void hasCycle() {
        ListNode n = new ListNode(1);
        n.next = new ListNode(2);
        n.next.next = new ListNode(3);
        n.next.next.next = n.next;
        Assertions.assertTrue(test.hasCycle(n));
        n.next.next.next = new ListNode(5);
        Assertions.assertFalse(test.hasCycle(n));
        n.next.next = n;
        Assertions.assertTrue(test.hasCycle(n));
    }
}