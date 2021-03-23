package org.phoenix.leetcode.learn.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_ReverseLinkedListTest {

    private final Problem03_ReverseLinkedList test = new Problem03_ReverseLinkedList();

    @Test
    void reverseList() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        assertEquals(4, test.reverseList(node).val);
    }
}