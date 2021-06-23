package org.phoenix.leetcode.challenges;

/**
 * Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
 * Constraints:
 * <p>
 * The number of nodes in the list is n.
 * 1 <= n <= 500
 * -500 <= Node.val <= 500
 * 1 <= left <= right <= n
 * <p>
 * <p>
 * Follow up: Could you do it in one pass?
 */

public class Problem23_ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Base case
        if (head == null) {
            return null;
        }
        // Current node
        ListNode curr = head;
        // Track previous node
        ListNode prev = null;
        // Loop until left
        for (int i = 0; i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }
        // Last node reference after looping
        ListNode lastNode = prev;
        // Keep ref of next node
        ListNode next;
        // Ref of original node
        ListNode temp = curr;
        // Loop until left is smaller
        while (left <= right) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            left++;
        }

        if (lastNode != null) {
            lastNode.next = prev;
        } else {
            head = prev;
        }
        temp.next = curr;
        return head;
    }

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
