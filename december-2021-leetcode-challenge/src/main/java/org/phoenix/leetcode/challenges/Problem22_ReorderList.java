package org.phoenix.leetcode.challenges;

import static org.phoenix.leetcode.challenges.Problem02_OddEvenLinkedList.ListNode;

/**
 * You are given the head of a singly linked-list. The list can be represented as:
 * <p>
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 * <p>
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 5 * 104].
 * 1 <= Node.val <= 1000
 */

public class Problem22_ReorderList {
    public ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) return head;

        // find the middle point
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // split into two part head & part2
        ListNode part2 = slow.next;
        slow.next = null;

        // reverse part 2
        ListNode prev = null, cur = part2, next = cur.next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        part2 = prev;

        // merge head & part2
        while (head != null && part2 != null) {
            ListNode p1 = head.next;
            ListNode p2 = part2.next;
            head.next = part2;
            head.next.next = p1;
            part2 = p2;
            head = p1;
        }
        return head;
    }
}
