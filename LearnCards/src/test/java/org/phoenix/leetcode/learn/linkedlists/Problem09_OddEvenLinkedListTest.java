package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.learn.linkedlists.Problem09_OddEvenLinkedList.ListNode;

class Problem09_OddEvenLinkedListTest {

    private final Problem09_OddEvenLinkedList test = new Problem09_OddEvenLinkedList();

    @Test
    void oddEvenList() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        ListNode n = test.oddEvenList(node);
        assertEquals(1,n.val);
        assertEquals(3,n.next.val);
    }
}