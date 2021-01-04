package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem04_MergeTwoSortedListsTest {

    private final Problem04_MergeTwoSortedLists test = new Problem04_MergeTwoSortedLists();

    @Test
    void mergeTwoLists() {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        outputList(test.mergeTwoLists(head1, head2));
    }

    private void outputList(ListNode mergedList) {
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        System.out.println();
    }
}