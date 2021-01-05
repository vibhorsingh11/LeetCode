package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem05_RemoveDuplicatesFromSortedListIITest {

    private final Problem05_RemoveDuplicatesFromSortedListII test = new Problem05_RemoveDuplicatesFromSortedListII();

    @Test
    void deleteDuplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode expected = test.deleteDuplicates(head);
        outputList(expected);
    }

    private void outputList(ListNode mergedList) {
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        System.out.println();
    }
}