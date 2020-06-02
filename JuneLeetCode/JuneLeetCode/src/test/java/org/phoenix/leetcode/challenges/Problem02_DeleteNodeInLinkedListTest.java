package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.phoenix.leetcode.challenges.Problem02_DeleteNodeInLinkedList.ListNode;

class Problem02_DeleteNodeInLinkedListTest {

    private final Problem02_DeleteNodeInLinkedList test = new Problem02_DeleteNodeInLinkedList();

    @Test
    void deleteNode() {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);

        assertEquals(5,test.deleteNode(node).val);
    }
}