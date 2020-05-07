package org.phoenix.leetcode.learn.linkedlists;

public class Problem14_RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        // if head is null or head.next is null then return head;
        if (head == null || head.next == null) return head;
        // initialized new nodes
        ListNode tail = head;
        ListNode current = head;
        int i = 0, length = 1;
        // calculating the length of the list
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        // if k is greater than length, then calculate rotation
        if (k > length) {
            k = k % length;
        }
        // if rotation is 0 or equal to length of then no need to rotate
        if (k == 0 || k == length) return head;
        k = length - k;
        // moving pointer to less than k -1
        while (i < k - 1) {
            current = current.next;
            i++;
        }
        // swapping nodes
        ListNode temp = current.next;
        current.next = null;
        tail.next = head;
        head = temp;

        return head;
    }

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
}
