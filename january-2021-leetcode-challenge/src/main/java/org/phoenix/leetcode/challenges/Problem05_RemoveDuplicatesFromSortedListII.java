/*
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers
 * from the original list. Return the linked list sorted as well.
 *
 * Example 1:
 * Input: head = [1,2,3,3,4,4,5]
 * Output: [1,2,5]*/

package org.phoenix.leetcode.challenges;

public class Problem05_RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode previousNode = dummy;
        ListNode nextNode = head;
        while (nextNode != null) {
            while (nextNode.next != null && nextNode.val == nextNode.next.val) {
                nextNode = nextNode.next;
            }
            if (previousNode.next != nextNode) {
                previousNode.next = nextNode.next;
            } else {
                previousNode = previousNode.next;
            }
            nextNode = nextNode.next;
        }
        return dummy.next;
    }
}
