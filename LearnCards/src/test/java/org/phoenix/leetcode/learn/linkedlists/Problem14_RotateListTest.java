package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.linkedlists.Problem14_RotateList.ListNode;

class Problem14_RotateListTest {

    private final Problem14_RotateList test = new Problem14_RotateList();

    @Test
    void rotateRight() {
        ListNode n = new ListNode(1);
        n.next = new ListNode(2);
        n.next.next = new ListNode(3);
        n.next.next.next = new ListNode(4);
        n.next.next.next.next = new ListNode(5);

        assertEquals(4, test.rotateRight(n, 2).val);
    }
}