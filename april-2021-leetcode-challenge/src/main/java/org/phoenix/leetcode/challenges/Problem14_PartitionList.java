/**
 * Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * <p>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * <p>
 * Example 1:
 * Input: head = [1,4,3,2,5,2], x = 3
 * Output: [1,2,2,4,3,5]
 * Example 2:
 * Input: head = [2,1], x = 2
 * Output: [1,2]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 200].
 * -100 <= Node.val <= 100
 * -200 <= x <= 200
 */
package org.phoenix.leetcode.challenges;

public class Problem14_PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        // Heads of both the partitions
        ListNode leftHead = null;
        ListNode rightHead = null;
        // Left partition and right partition
        ListNode leftTraversalNode = null;
        ListNode rightTraversalNode = null;
        // Reference to the head node
        ListNode traversalNode = head;
        // Loop through the linked list
        while (traversalNode != null) {
            // If the current node has data less than x
            if (traversalNode.val < x) {
                // This should run only one time for head
                if (leftHead == null) {
                    leftTraversalNode = traversalNode;
                    leftHead = leftTraversalNode;
                } else {
                    leftTraversalNode.next = traversalNode;
                    leftTraversalNode = traversalNode;
                }
            } else {
                if (rightHead == null) {
                    rightTraversalNode = traversalNode;
                    rightHead = rightTraversalNode;
                } else {
                    rightTraversalNode.next = traversalNode;
                    rightTraversalNode = traversalNode;
                }
            }
            traversalNode = traversalNode.next;
        }
        // Dereference nodes to avoid cycle
        if (leftTraversalNode != null) {
            leftTraversalNode.next = null;
        }
        if (rightTraversalNode != null) {
            rightTraversalNode.next = null;
        }
        if (leftHead == null) {
            return rightHead;
        }
        // Link two lists
        leftTraversalNode.next = rightHead;
        return leftHead;
    }
}
