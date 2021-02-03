package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem03_LinkedListCycleTest {

    private final Problem03_LinkedListCycle test = new Problem03_LinkedListCycle();

    @Test
    void hasCycle() {
        ListNode root = new ListNode(3);
        root.next = new ListNode(2);
        root.next.next = new ListNode(0);
        root.next.next.next = new ListNode(-4);
        root.next.next.next.next = root.next;
        assertTrue(test.hasCycle(root));

        ListNode root1 = new ListNode(1);
        assertFalse(test.hasCycle(root1));
    }
}