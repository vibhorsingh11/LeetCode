package org.phoenix.leetcode.learn.queue_stack;

public class Problem05_MinStack {

    private static Node top;

    private static class Node {
        private int data;
        // Next pointer of the node
        private Node next;
        // Minimum element in the Stack
        private int minimum;

        /**
         * Default constructor
         */
        Node(int data) {
            this.data = data;
            this.next = null;
            this.minimum = data;
        }
    }

    public static void push(int x) {
        Node node = new Node(x);
        // Check if the head is null
        if (top != null) {
            node.next = top;
            // Update the minimum if required (if current element is less than current minimum)
            node.minimum = Math.min(top.minimum, x);
            // Make the new node as the top
        }
        top = node;
    }

    public void pop() {
        if (top == null) {
            return;
        }
        top = top.next;
    }

    public int top() {
        return top.data;
    }

    public int getMin() {
        if (top == null) {
            return Integer.MAX_VALUE;
        }
        return top.minimum;

    }
}
