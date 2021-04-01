package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem01_PalindromeLinkedListTest {

    private final Problem01_PalindromeLinkedList test = new Problem01_PalindromeLinkedList();

    @Test
    void isPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(test.isPalindrome(head));
    }
}