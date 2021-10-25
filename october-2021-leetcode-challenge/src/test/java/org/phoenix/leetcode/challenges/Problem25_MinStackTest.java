package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem25_MinStackTest {

    @Test
    void push() {
        Problem25_MinStack obj = new Problem25_MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}