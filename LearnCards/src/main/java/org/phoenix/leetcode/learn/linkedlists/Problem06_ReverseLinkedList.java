package org.phoenix.leetcode.learn.linkedlists;

/*
* Reverse a singly linked list.
*
* Example:
* Input: 1->2->3->4->5->NULL
* Output: 5->4->3->2->1->NULL*/

public class Problem06_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return null;
        // Initialized 3 nodes
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        // Looping over the curr node and changing the next
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
