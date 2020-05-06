package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.phoenix.leetcode.learn.linkedlists.Problem10_MergeTwoSortedLists.ListNode;

class Problem10_MergeTwoSortedListsTest {

    private final Problem10_MergeTwoSortedLists test = new Problem10_MergeTwoSortedLists();

    @Test
    void mergeTwoLists() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(4);

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(4);

        ListNode n = test.mergeTwoLists(node, node1);
        assertEquals(1, n.next.val);
        assertEquals(2, n.next.next.val);

    }
}