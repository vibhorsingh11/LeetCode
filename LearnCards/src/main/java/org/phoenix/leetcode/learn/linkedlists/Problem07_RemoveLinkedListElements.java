package org.phoenix.leetcode.learn.linkedlists;

/*
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */

public class Problem07_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        // If head is null then return null
        if(head == null) return null;
        // Created a new node and added ahead of head
        ListNode curr = new ListNode(-1);
        curr.next = head;
        ListNode node = curr;
        // Checking if val is found then remove the node
        while(node.next != null) {
            if(node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return curr.next;
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
