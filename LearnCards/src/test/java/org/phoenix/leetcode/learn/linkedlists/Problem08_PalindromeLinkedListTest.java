package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.phoenix.leetcode.learn.linkedlists.Problem08_PalindromeLinkedList.Node;

class Problem08_PalindromeLinkedListTest {

    private final Problem08_PalindromeLinkedList testObject = new Problem08_PalindromeLinkedList();

    @Test
    void isPalindrome() {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(2);
        Node n4 = new Node(1);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        assertTrue(testObject.isPalindrome(head));
        assertTrue(testObject.isPalindrome(null));
        assertTrue(testObject.isPalindrome(new Node(3)));

        n2.next = null;

        assertFalse(testObject.isPalindrome(head));
    }
}