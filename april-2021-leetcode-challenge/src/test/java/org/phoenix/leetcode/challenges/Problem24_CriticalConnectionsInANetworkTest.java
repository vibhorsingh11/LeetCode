package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem24_CriticalConnectionsInANetworkTest {

    private final Problem24_CriticalConnectionsInANetwork test = new Problem24_CriticalConnectionsInANetwork();

    @Test
    void criticalConnections() {
        int n = 4;
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 3));
        assertEquals(expected, test.criticalConnections(n, connections));
    }
}