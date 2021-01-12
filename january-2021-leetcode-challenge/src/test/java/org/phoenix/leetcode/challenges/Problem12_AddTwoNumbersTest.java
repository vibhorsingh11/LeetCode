package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem12_AddTwoNumbersTest {

    private final Problem12_AddTwoNumbers test = new Problem12_AddTwoNumbers();

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = test.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}