package org.phoenix.leetcode.learn.linkedlists;

/*
* Given a singly linked list, group all odd nodes together followed by the even nodes.
* Please note here we are talking about the node number and not the value in the nodes.
*
* You should try to do it in place. The program should run in O(1) space complexity and O(nodes)
* time complexity.

* Example 1:
* Input: 1->2->3->4->5->NULL
* Output: 1->3->5->2->4->NULL
*/

public class Problem09_OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        // If head is null then return null
        if (head == null) return null;
        // Creating odd, assign head to it head. As it is the first position in list
        ListNode odd = head;
        // Creating odd, assign head to it head.next
        ListNode even = head.next;
        // Assigning even to evenhead
        ListNode evenHead = even;
        // Looping until even is not null
        // Assigning node at odd position to next of even and node at even position to odd
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        // connecting evenhead to next of odd node
        odd.next = evenHead;
        return head;
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
