package org.phoenix.leetcode.challenges;

/**Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 Implement the MinStack class:

 MinStack() initializes the stack object.
 void push(int val) pushes the element val onto the stack.
 void pop() removes the element on the top of the stack.
 int top() gets the top element of the stack.
 int getMin() retrieves the minimum element in the stack.
 Constraints:

 -231 <= val <= 231 - 1
 Methods pop, top and getMin operations will always be called on non-empty stacks.
 At most 3 * 104 calls will be made to push, pop, top, and getMin.*/

public class Problem25_MinStack {
    private Node top;
    private class Node {
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

    /** initialize your data structure here. */
    public Problem25_MinStack() {

    }

    public void push(int x) {
        Node node = new Node(x);
        // Check if the head is null
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            // Update the minimum if required (if current element is less than current minimum)
            node.minimum = Math.min(top.minimum, x);
            // Make the new node as the top
            top = node;
        }
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
