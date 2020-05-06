package org.phoenix.leetcode.learn.linkedlists;

/*
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 *  Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

public class Problem10_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        // Created a dummy list with 0 as first node value
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (true) {
            // if first list is empty then return second list
            if (a == null) {
                curr.next = b;
                break;
            }
            // if second list is empty then return first list
            if (b == null) {
                curr.next = a;
                break;
            }
            // if first list value is less than second list value, then append the first list node
            if (a.val <= b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            // move the pointer to next node
            curr = curr.next;
        }
        return dummy.next;
    }

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
