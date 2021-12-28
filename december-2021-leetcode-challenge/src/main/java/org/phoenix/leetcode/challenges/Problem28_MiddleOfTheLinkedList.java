package org.phoenix.leetcode.challenges;

import static org.phoenix.leetcode.challenges.Problem02_OddEvenLinkedList.ListNode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 */

public class Problem28_MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        return slowptr;
    }
}
