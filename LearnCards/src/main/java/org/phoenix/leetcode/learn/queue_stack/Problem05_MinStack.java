package org.phoenix.leetcode.learn.queue_stack;

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 * Example 1:
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * Output
 * [null,null,null,null,-3,null,0,-2]
 *
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 */

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
