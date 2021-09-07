package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem07_ReverseLinkedList.ListNode;

class Problem07_ReverseLinkedListTest {

    private final Problem07_ReverseLinkedList test = new Problem07_ReverseLinkedList();

    @Test
    void reverseList() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        assertEquals(4, test.reverseList(node).val);
    }
}