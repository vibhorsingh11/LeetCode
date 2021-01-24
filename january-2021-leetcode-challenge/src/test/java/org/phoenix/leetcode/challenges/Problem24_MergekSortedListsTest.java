package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem24_MergekSortedListsTest {

    private final Problem24_MergekSortedLists test = new Problem24_MergekSortedLists();

    @Test
    void mergeKLists() {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);

        printList(test.mergeKLists(new ListNode[]{head1, head2, head3}));
    }

    private void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}