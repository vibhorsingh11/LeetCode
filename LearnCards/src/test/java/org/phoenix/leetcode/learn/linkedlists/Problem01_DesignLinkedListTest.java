package org.phoenix.leetcode.learn.linkedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem01_DesignLinkedListTest {

    private Problem01_DesignLinkedList.SinglyLinkedList singlyLinkedList;

    @BeforeEach
    public void setUp() {
        singlyLinkedList = new Problem01_DesignLinkedList.SinglyLinkedList();
        singlyLinkedList.addAtHead(1);
        singlyLinkedList.addAtIndex(1, 2);
        singlyLinkedList.addAtIndex(2, 3);
        singlyLinkedList.addAtIndex(3, 4);
    }

    @Test
    void get() {
        assertEquals(2, singlyLinkedList.get(1));
        assertEquals(4, singlyLinkedList.get(3));
        singlyLinkedList.addAtIndex(4, 5);
        assertEquals(5, singlyLinkedList.get(4));
        assertEquals(-1, singlyLinkedList.get(6));
    }

    @Test
    void addAtHead() {
        singlyLinkedList.addAtHead(5);
        assertEquals(5, singlyLinkedList.get(0));
        singlyLinkedList.addAtHead(6);
        assertEquals(6, singlyLinkedList.get(0));
    }

    @Test
    void addAtTail() {
        singlyLinkedList.addAtTail(6);
        assertEquals(6, singlyLinkedList.get(4));
        singlyLinkedList.addAtTail(8);
        assertEquals(8, singlyLinkedList.get(5));
    }

    @Test
    void addAtIndex() {
        singlyLinkedList.addAtIndex(4, 8);
        assertEquals(8, singlyLinkedList.get(4));
        singlyLinkedList.addAtHead(7);
        assertEquals(8, singlyLinkedList.get(5));
        singlyLinkedList.addAtHead(9);
        assertEquals(9, singlyLinkedList.get(0));
    }

    @Test
    void deleteAtIndex() {
        singlyLinkedList.deleteAtIndex(0);
        assertEquals(2, singlyLinkedList.get(0));
        singlyLinkedList.deleteAtIndex(3);
        assertEquals(-1, singlyLinkedList.get(3));
    }
}