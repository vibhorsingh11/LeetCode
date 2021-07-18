package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem18_ReverseNodesInGroup.ListNode;

class Problem18_ReverseNodesInGroupTest {

    private final Problem18_ReverseNodesInGroup test = new Problem18_ReverseNodesInGroup();

    @Test
    void reverseKGroup() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        assertEquals(2, test.reverseKGroup(head, 2).val);
        assertEquals(2, test.reverseKGroup(head, 1).next.val);
        assertEquals(2, test.reverseKGroup(head, 4).next.next.val);
        assertEquals(2, test.reverseKGroup(head, 3).next.next.next.val);
    }
}