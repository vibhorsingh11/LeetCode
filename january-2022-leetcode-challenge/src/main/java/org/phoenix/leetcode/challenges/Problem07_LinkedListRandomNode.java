package org.phoenix.leetcode.challenges;

import java.util.Random;

/**
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(ListNode head) Initializes the object with the integer array nums.
 * int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be choosen.
 */

public class Problem07_LinkedListRandomNode {
    ListNode head;
    Random random;

    public Problem07_LinkedListRandomNode(ListNode h) {
        head = h;
        random = new Random();
    }

    public int getRandom() {

        ListNode c = head;
        int r = c.val;
        for (int i = 1; c.next != null; i++) {

            c = c.next;
            if (random.nextInt(i + 1) == i) r = c.val;
        }

        return r;
    }

    //Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }
}
