package org.phoenix.leetcode.learn.linkedlists;

/*
* You are given a doubly linked list which in addition to the next and previous pointers,
* it could have a child pointer, which may or may not point to a separate doubly linked list.
* These child lists may have one or more children of their own, and so on,
* to produce a multilevel data structure, as shown in the example below.
*
* Flatten the list so that all the nodes appear in a single-level, doubly linked list.
*  You are given the head of the first level of the list.
*
* Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
* Output: [1,2,3,7,8,11,12,9,10,4,5,6]
* Explanation:
*  1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
             |
             11--12--NULL
* */

public class Problem12_FlattenMultilevelList {
    // Created a node
    Node curr;

    public Node flatten(Node head) {
        // if head equal to null
        if (head == null) return null;
        // initialized the curr to head of list
        curr = head;
        // initialized the nxt pointer to next node of head for later use
        Node nxt = head.next;
        // if child node of head is not null, the set the previous of child of head to head
        if (head.child != null) {
            head.child.prev = head;
            head.next = head.child;
            // recursively calling the function with head.child pointer
            flatten(head.child);
            head.child = null;
        }
        // if nxt is not equal to null
        if (nxt != null) {
            curr.next = nxt;
            nxt.prev = curr;
            flatten(nxt);
        }
        return head;
    }

    // Definition for a Node.
    static class Node {
        public int data;
        public Node prev;
        public Node next;
        public Node child;
        Node(int data) {
            this.data = data;
        }
    }
}
