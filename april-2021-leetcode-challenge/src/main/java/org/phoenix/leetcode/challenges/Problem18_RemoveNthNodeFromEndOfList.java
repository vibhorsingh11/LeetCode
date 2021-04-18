/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * <p>
 * Follow up: Could you do this in one pass?
 */
package org.phoenix.leetcode.challenges;

public class Problem18_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // edge case
        if (head == null) return null;
        // temp node
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode fast = temp;
        ListNode slow = temp;
        // loop until n + 1
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }
        // looping list until fast node is not null
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // removing the node
        slow.next = slow.next.next;
        return temp.next;
    }
}
