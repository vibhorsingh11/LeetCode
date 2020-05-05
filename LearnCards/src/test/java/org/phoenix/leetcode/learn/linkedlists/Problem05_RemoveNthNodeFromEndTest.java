package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.phoenix.leetcode.learn.linkedlists.Problem05_RemoveNthNodeFromEnd.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_RemoveNthNodeFromEndTest {

    private final Problem05_RemoveNthNodeFromEnd test = new Problem05_RemoveNthNodeFromEnd();

    @Test
    void removeNthFromEnd() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        assertEquals(5, test.removeNthFromEnd(node, 2).next.next.next.val);
    }
}