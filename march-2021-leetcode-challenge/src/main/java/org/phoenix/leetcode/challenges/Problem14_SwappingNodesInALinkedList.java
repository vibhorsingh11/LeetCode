/**
 * You are given the head of a linked list, and an integer k.
 * <p>
 * Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node
 * from the end (the list is 1-indexed).
 * Example 1
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [1,4,3,2,5]
 * Constraints:
 * <p>
 * The number of nodes in the list is n.
 * 1 <= k <= n <= 105
 * 0 <= Node.val <= 100
 */
package org.phoenix.leetcode.challenges;

public class Problem14_SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        // base condition
        if (head == null) return null;
        // Setting current node
        ListNode fast = head;
        // Finding the kth from start
        while (k > 1) {
            fast = fast.next;
            k--;
        }
        // Assigning the kth from start to new node
        ListNode start = fast;
        ListNode end = head;
        // Looping until reach the end of list
        while (fast.next != null) {
            fast = fast.next;
            end = end.next;
        }
        // Swapping the first kth value with last kth value of node
        int temp = start.val;
        start.val = end.val;
        end.val = temp;
        return head;
    }
}
