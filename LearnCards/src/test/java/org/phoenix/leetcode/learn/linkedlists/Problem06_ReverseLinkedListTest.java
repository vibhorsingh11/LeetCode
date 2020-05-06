package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.phoenix.leetcode.learn.linkedlists.Problem06_ReverseLinkedList.ListNode;

class Problem06_ReverseLinkedListTest {

    private final Problem06_ReverseLinkedList test = new Problem06_ReverseLinkedList();

    @Test
    void reverseList() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        Assertions.assertEquals(5,test.reverseList(node).val);
    }
}