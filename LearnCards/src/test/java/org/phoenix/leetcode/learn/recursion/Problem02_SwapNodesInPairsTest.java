package org.phoenix.leetcode.learn.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_SwapNodesInPairsTest {

    private final Problem02_SwapNodesInPairs test = new Problem02_SwapNodesInPairs();

    @Test
    void swapPairs() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        assertEquals(2, test.swapPairs(node).val);
    }
}