package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.phoenix.leetcode.learn.linkedlists.Problem04_IntersectionOfTwoLinkedLists.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class Problem04_IntersectionOfTwoLinkedListsTest {

    private final Problem04_IntersectionOfTwoLinkedLists test = new Problem04_IntersectionOfTwoLinkedLists();

    @Test
    void getIntersectionNode() {
        ListNode listA = new ListNode(4);
        ListNode listB = new ListNode(5);
        listA.next = new ListNode(1);
        listA.next.next = new ListNode(8);
        listB.next = new ListNode(0);
        listB.next.next = new ListNode(1);
        listB.next.next.next = listA.next.next;
        listA.next.next.next = new ListNode(4);
        listA.next.next.next.next = new ListNode(5);

        Assertions.assertEquals(8, test.getIntersectionNode(listA, listB).val);
    }
}