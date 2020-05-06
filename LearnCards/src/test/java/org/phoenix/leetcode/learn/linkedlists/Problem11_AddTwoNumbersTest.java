package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.phoenix.leetcode.learn.linkedlists.Problem11_AddTwoNumbers.ListNode;

class Problem11_AddTwoNumbersTest {

    private final Problem11_AddTwoNumbers test = new Problem11_AddTwoNumbers();

    @Test
    void addTwoNumbers() {
        ListNode node = new ListNode(2);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);

        ListNode node1 = new ListNode(5);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(4);

        ListNode n = test.addTwoNumbers(node, node1);

        assertEquals(7, n.val);
        assertEquals(0, n.next.val);
        assertEquals(8, n.next.next.val);
    }
}