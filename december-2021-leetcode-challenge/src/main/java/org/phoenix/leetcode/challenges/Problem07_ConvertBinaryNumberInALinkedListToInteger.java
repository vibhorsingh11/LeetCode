package org.phoenix.leetcode.challenges;

/**
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * Constraints:
 * <p>
 * The Linked List is not empty.
 * Number of nodes will not exceed 30.
 * Each node's value is either 0 or 1.
 */

public class Problem07_ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int sum = 0;

        while (head != null) {
            sum *= 2;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

    //Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }
}
