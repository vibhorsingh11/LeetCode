package org.phoenix.leetcode.learn.linkedlists;

/*
 * Given a linked list, determine if it has a cycle in it.
 * To represent a cycle in the given linked list, we use an integer pos which represents the position
 * (0-indexed) in the linked list where tail connects to. If pos is -1,
 * then there is no cycle in the linked list.
 *
 * Example 1:
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * */

public class Problem02_LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        // Created two pointer fast and slow
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            // Moving fast pointer twice as slow pointer
            fast = fast.next.next;
            slow = slow.next;
            // If fast and slow meets at same node then it is a cycle else not
            if (fast == slow) {
                return true;
            }
        }
        return false;
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
