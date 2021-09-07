package org.phoenix.leetcode.challenges;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 * <p>
 * <p>
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class Problem07_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }

    //   Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
