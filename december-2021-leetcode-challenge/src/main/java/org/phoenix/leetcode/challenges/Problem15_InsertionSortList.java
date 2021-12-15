package org.phoenix.leetcode.challenges;

/**
 * Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
 * <p>
 * The steps of the insertion sort algorithm:
 * <p>
 * Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
 * It repeats until no input elements remain.
 * The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 5000].
 * -5000 <= Node.val <= 5000
 */

public class Problem15_InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode resNode = new ListNode(0);
        ListNode curr = head;
        while (curr != null) {
            ListNode prev = resNode;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return resNode.next;
    }

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }
}
