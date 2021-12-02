package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem02_OddEvenLinkedList.ListNode;

class Problem02_OddEvenLinkedListTest {

    private final Problem02_OddEvenLinkedList test = new Problem02_OddEvenLinkedList();

    @Test
    void oddEvenList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        assertEquals(2, test.oddEvenList(head).next.next.next.val);

    }
}