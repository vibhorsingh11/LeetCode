package org.phoenix.leetcode.challenges;

/**
 * You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.
 * <p>
 * Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.
 * Constraints:
 * <p>
 * The number of Nodes will not exceed 1000.
 * 1 <= Node.val <= 105
 */

public class Problem31_FlattenAMultilevelDoublyLinkedList {
    Node curr;

    public Node flatten(Node head) {
        if (head == null) return null;
        curr = head;
        Node nxt = head.next;
        if (head.child != null) {
            head.child.prev = head;
            head.next = head.child;
            flatten(head.child);
            head.child = null;
        }
        if (nxt != null) {
            curr.next = nxt;
            nxt.prev = curr;
            flatten(nxt);
        }
        return head;
    }

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        Node(int val) {
            this.val = val;
        }
    }
}
