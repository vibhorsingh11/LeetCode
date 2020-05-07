package org.phoenix.leetcode.learn.linkedlists;

/*
 * A linked list is given such that each node contains an additional random pointer which could point
 *  to any node in the list or null.
 * Return a deep copy of the list.
 * The Linked List is represented in the input/output as a list of n nodes.
 * Each node is represented as a pair of [val, random_index] where:
 * val: an integer representing Node.val
 *
 * random_index: the index of the node (range from 0 to n-1) where random pointer points to,
 * or null if it does not point to any node.
 *
 * Example 1:
 *
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 */

import java.util.HashMap;

public class Problem13_RandomPointer {

    public Node copyRandomList(Node head) {
        Node curr = head, clone;
        // map to store new cloned nodes
        HashMap<Node, Node> map = new HashMap<>();
        // cloning all node and entering it in map
        while (curr != null) {
            clone = new Node(curr.val);
            map.put(curr, clone);
            curr = curr.next;
        }
        curr = head;
        // looping over the curr node and checking each pointer of node from the map for equality
        while (curr != null) {
            clone = map.get(curr);
            clone.next = map.get(curr.next);
            clone.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

    // Definition for a Node.
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
