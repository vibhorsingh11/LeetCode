package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_ConvertSortedListToBinarySearchTreeTest {

    private final Problem06_ConvertSortedListToBinarySearchTree test = new Problem06_ConvertSortedListToBinarySearchTree();

    @Test
    void sortedListToBST() {
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        TreeNode root = test.sortedListToBST(head);
        assertEquals(-10, root.left.left.val);
        assertEquals(9, root.right.val);
    }
}