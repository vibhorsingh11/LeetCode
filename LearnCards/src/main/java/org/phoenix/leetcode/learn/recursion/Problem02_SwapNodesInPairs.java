/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 * <p>
 * <p>
 * Follow up: Can you solve the problem without modifying the values in the list's nodes? (i.e., Only nodes themselves may be changed.)
 */
package org.phoenix.leetcode.learn.recursion;

public class Problem02_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        // Edge case
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head.next;
        ListNode rec = node.next;
        node.next = head;
        head.next = swapPairs(rec);

        return node;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
