package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.queue_stack.Problem09_CloneGraph.Node;

import java.util.ArrayList;
import java.util.List;

class Problem09_CloneGraphTest {

    private final Problem09_CloneGraph test = new Problem09_CloneGraph();

    @Test
    void cloneGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        List<Node> list = new ArrayList<>();
        list.add(node2);
        list.add(node4);
        node1.neighbors = list;
        list = new ArrayList<>();
        list.add(node1);
        list.add(node3);
        node2.neighbors = list;
        list = new ArrayList<>();
        list.add(node2);
        list.add(node4);
        node3.neighbors = list;
        list = new ArrayList<>();
        list.add(node3);
        list.add(node1);
        node4.neighbors = list;

        assertEquals(1, test.cloneGraph(node1).val);
    }
}