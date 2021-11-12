package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.phoenix.leetcode.challenges.Problem12_RemoveLinkedListElements.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_RemoveLinkedListElementsTest {

    private final Problem12_RemoveLinkedListElements test = new Problem12_RemoveLinkedListElements();

    @Test
    void removeElements() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(6);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        assertEquals(6, test.removeElements(node, 2).next.val);
    }
}