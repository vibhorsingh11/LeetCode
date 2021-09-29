package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.phoenix.leetcode.challenges.Problem29_SplitLinkedListInParts.ListNode;


class Problem29_SplitLinkedListInPartsTest {

    private final Problem29_SplitLinkedListInParts test = new Problem29_SplitLinkedListInParts();

    @Test
    void splitListToParts() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int k = 5;
        test.splitListToParts(head, k);
    }
}