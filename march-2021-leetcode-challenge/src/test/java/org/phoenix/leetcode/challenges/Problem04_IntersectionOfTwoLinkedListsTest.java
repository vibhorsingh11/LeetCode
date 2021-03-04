package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_IntersectionOfTwoLinkedListsTest {

    private final Problem04_IntersectionOfTwoLinkedLists test = new Problem04_IntersectionOfTwoLinkedLists();

    @Test
    void getIntersectionNode() {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;

        assertEquals(8, test.getIntersectionNode(headA, headB).val);
    }
}