package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_SwappingNodesInALinkedListTest {

    private final Problem14_SwappingNodesInALinkedList test = new Problem14_SwappingNodesInALinkedList();

    @Test
    void swapNodes() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        assertEquals(4, test.swapNodes(head, 2).next.val);
    }
}