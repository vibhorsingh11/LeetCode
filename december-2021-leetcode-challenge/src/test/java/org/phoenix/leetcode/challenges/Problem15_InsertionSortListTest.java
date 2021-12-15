package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem15_InsertionSortList.ListNode;

class Problem15_InsertionSortListTest {

    private final Problem15_InsertionSortList test = new Problem15_InsertionSortList();

    @Test
    void insertionSortList() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        assertEquals(1, test.insertionSortList(head).val);
    }
}