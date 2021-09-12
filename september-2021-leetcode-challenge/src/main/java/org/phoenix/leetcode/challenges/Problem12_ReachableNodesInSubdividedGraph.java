package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * You are given an undirected graph (the "original graph") with n nodes labeled from 0 to n - 1. You decide to subdivide each edge in the graph into a chain of nodes, with the number of new nodes varying between each edge.
 * <p>
 * The graph is given as a 2D array of edges where edges[i] = [ui, vi, cnti] indicates that there is an edge between nodes ui and vi in the original graph, and cnti is the total number of new nodes that you will subdivide the edge into. Note that cnti == 0 means you will not subdivide the edge.
 * <p>
 * To subdivide the edge [ui, vi], replace it with (cnti + 1) new edges and cnti new nodes. The new nodes are x1, x2, ..., xcnti, and the new edges are [ui, x1], [x1, x2], [x2, x3], ..., [xcnti+1, xcnti], [xcnti, vi].
 * <p>
 * In this new graph, you want to know how many nodes are reachable from the node 0, where a node is reachable if the distance is maxMoves or less.
 * <p>
 * Given the original graph and maxMoves, return the number of nodes that are reachable from node 0 in the new graph.
 * Constraints:
 * <p>
 * 0 <= edges.length <= min(n * (n - 1) / 2, 104)
 * edges[i].length == 3
 * 0 <= ui < vi < n
 * There are no multiple edges in the graph.
 * 0 <= cnti <= 104
 * 0 <= maxMoves <= 109
 * 1 <= n <= 3000
 */

public class Problem12_ReachableNodesInSubdividedGraph {
    public int reachableNodes(int[][] edges, int M, int N) {
        HashMap<Integer, HashMap<Integer, Integer>> e = new HashMap<>();
        for (int i = 0; i < N; ++i) e.put(i, new HashMap<>());
        for (int[] v : edges) {
            e.get(v[0]).put(v[1], v[2]);
            e.get(v[1]).put(v[0], v[2]);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[0] - a[0]));
        pq.offer(new int[]{M, 0});
        HashMap<Integer, Integer> seen = new HashMap<>();
        while (!pq.isEmpty()) {
            int moves = pq.peek()[0], i = pq.peek()[1];
            pq.poll();
            if (!seen.containsKey(i)) {
                seen.put(i, moves);
                for (int j : e.get(i).keySet()) {
                    int moves2 = moves - e.get(i).get(j) - 1;
                    if (!seen.containsKey(j) && moves2 >= 0)
                        pq.offer(new int[]{moves2, j});
                }
            }
        }
        int res = seen.size();
        for (int[] v : edges) {
            int a = seen.getOrDefault(v[0], 0);
            int b = seen.getOrDefault(v[1], 0);
            res += Math.min(a + b, v[2]);
        }
        return res;
    }
}
