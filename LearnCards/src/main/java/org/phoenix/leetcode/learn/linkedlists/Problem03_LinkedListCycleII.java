package org.phoenix.leetcode.learn.linkedlists;

/*
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position
 * (0-indexed) in the linked list where tail connects to. If pos is -1,
 * then there is no cycle in the linked list.
 *
 * Note: Do not modify the linked list.
 *
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * */

public class Problem03_LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        // Created two pointers
        ListNode fast = head;
        ListNode slow = head;
        // Looping over the list until fast and slow pointer are equal
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        // Return null if next pointer is null or fast is null
        if (fast == null || fast.next == null) {
            return null;
        }
        // Resetting the slow pointer to head
        slow = head;
        // Looping again till the both pointer meets at some place
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}