package org.phoenix.leetcode.learn.linkedlists;

/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:
 *
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * Output: Reference of the node with value = 8
 * */

public class Problem04_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Created two node for each list
        ListNode listA = headA;
        ListNode listB = headB;
        // If any list is null then return null
        if (headA == null || headB == null) return null;
        // Looping over both list until they are not equal to each other
        // If ListA is then set it to its head;
        // If ListB is then set it to its head;
        while (listA != listB) {
            if (listA == null) listA = headB;
            if (listB == null) listB = headA;
            if (listA == listB) {
                return listA;
            }
            listA = listA.next;
            listB = listB.next;

        }
        return listA;
    }

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
