package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem31_FlattenAMultilevelDoublyLinkedList.Node;

class Problem31_FlattenAMultilevelDoublyLinkedListTest {

    private final Problem31_FlattenAMultilevelDoublyLinkedList test = new Problem31_FlattenAMultilevelDoublyLinkedList();

    @Test
    void flatten() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        one.next = two;
        two.prev = one;
        two.next = three;
        three.next = four;
        three.prev = two;
        three.child = seven;
        four.prev = three;
        four.next = five;
        five.prev = four;
        five.next = six;
        six.prev = five;
        seven.next = eight;
        eight.prev = seven;
        eight.next = nine;
        nine.prev = eight;
        nine.next = ten;
        ten.prev = nine;
        eight.child = eleven;
        eleven.next = twelve;
        twelve.prev = eleven;
        Node expected = test.flatten(one);
        assertEquals(1, expected.val);
        assertEquals(2, expected.next.val);
    }
}