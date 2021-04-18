package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_RemoveNthNodeFromEndOfListTest {

    private final Problem18_RemoveNthNodeFromEndOfList test = new Problem18_RemoveNthNodeFromEndOfList();

    @Test
    void removeNthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        assertEquals(5, test.removeNthFromEnd(head, 2).next.next.next.val);
    }
}