package org.phoenix.leetcode.learn.linkedlists;

/*
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

public class Problem11_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Created new list and initialized with 0
        ListNode dummy = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummy;
        // for storing the carry
        int carry = 0;
        // Looping until p or q is not null
        while (p != null || q != null) {
            // if q or p is not null then assign their value
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            // adding both the values with carry
            int sum = x + y + carry;
            // determining the carry
            carry = sum / 10;
            // assigning calculated value to new node
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            // checking id p or q is empty if not then move the pointers to next
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        // if carry is greater then 0, then it needs to added to list as new node
        if (carry > 0) {
            curr.next = new ListNode(carry);
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
