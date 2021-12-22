package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem02_OddEvenLinkedList.ListNode;

class Problem22_ReorderListTest {

    private final Problem22_ReorderList test = new Problem22_ReorderList();

    @Test
    void reorderList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        assertEquals(4, test.reorderList(head).next.val);
    }
}