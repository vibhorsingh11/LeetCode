package org.phoenix.leetcode.challenges;

/**
 * Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Input: head = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
 * Constraints:
 * <p>
 * The number of nodes in head is in the range [0, 2 * 104].
 * -10^5 <= Node.val <= 10^5
 */

public class Problem06_ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        // Edge case
        if (head == null) {
            return null;
        }
        // Find the middle node
        ListNode midNode = findMid(head);
        // Create new node with middle node to
        // create bst
        TreeNode node = new TreeNode(midNode.val);
        // head equals midNode then return
        if (head == midNode) {
            return node;
        }
        // create left and right subtree
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(midNode.next);
        return node;
    }

    private static ListNode findMid(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        // Node to keep track of previous node of slow
        ListNode prev = head;
        // loop until fast node is not null
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
