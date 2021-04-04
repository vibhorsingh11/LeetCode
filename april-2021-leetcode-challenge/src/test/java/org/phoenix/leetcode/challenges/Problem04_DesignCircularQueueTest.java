package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem04_DesignCircularQueueTest {

    @Test
    void enQueue() {
        Problem04_DesignCircularQueue myCircularQueue = new Problem04_DesignCircularQueue(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False
        myCircularQueue.Rear();     // return 3
        myCircularQueue.isFull();   // return True
        myCircularQueue.deQueue();  // return True
        myCircularQueue.enQueue(4); // return True
        myCircularQueue.Rear();     // return 4
    }
}