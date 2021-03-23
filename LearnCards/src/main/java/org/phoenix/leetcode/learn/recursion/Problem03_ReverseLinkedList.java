/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * <p>
 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 * <p>
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
package org.phoenix.leetcode.learn.recursion;

public class Problem03_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // Edge case
        if (head == null || head.next == null) {
            return head;
        }
        // Reverse the linked list and put starting node
        // to end
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }
}
