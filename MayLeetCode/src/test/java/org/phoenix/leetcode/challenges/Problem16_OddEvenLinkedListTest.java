package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.challenges.Problem16_OddEvenLinkedList.ListNode;

class Problem16_OddEvenLinkedListTest {

    private final Problem16_OddEvenLinkedList test = new Problem16_OddEvenLinkedList();

    @Test
    void oddEvenList() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        assertEquals(3, test.oddEvenList(root).next.val);
    }
}