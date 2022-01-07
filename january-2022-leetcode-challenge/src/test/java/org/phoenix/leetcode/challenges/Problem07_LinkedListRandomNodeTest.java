package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import org.phoenix.leetcode.challenges.Problem07_LinkedListRandomNode.ListNode;

class Problem07_LinkedListRandomNodeTest {

    @Test
    void getRandom() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Problem07_LinkedListRandomNode test = new Problem07_LinkedListRandomNode(head);
        System.out.println(test.getRandom());
    }
}