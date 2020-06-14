package org.phoenix.leetcode.challenges;

/*
 * There are n cities connected by m flights. Each flight starts from city u and arrives at v with a price w.
 *
 * Now given all the cities and flights, together with starting city src and the destination dst,
 * your task is to find the cheapest price from src to dst with up to k stops. If there is no such route,
 * output -1.
 *
 * Example 1:
 * Input:
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 1
 * Output: 200
 * Explanation:
 * The graph looks like this:
 * The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.
 */

import java.util.*;

public class Problem14_CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int minPathCost = Integer.MAX_VALUE; // initialize the minPathCost with Integer.MAX_VALUE
        Map<Integer, List<int[]>> graph = createGraph(flights); // create graph

        int step = 0;
        Queue<int[]> q = new LinkedList<>(); // save next stop with the cost till that stop
        q.add(new int[]{src, 0});
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] currentStop = q.poll();
                if (currentStop[0] == dst)
                    minPathCost = Math.min(minPathCost, currentStop[1]);
                if (!graph.containsKey(currentStop[0])) // if no roots from that stop continue
                    continue;
                for (int[] flight : graph.get(currentStop[0])) {
                    if (currentStop[1] + flight[1] > minPathCost) // cost + current flight cost > minPathCost discard that path ~ pruning
                        continue;
                    q.add(new int[]{flight[0], currentStop[1] + flight[1]});
                }
            }
            if (step++ > K) // once we crossed K stops and not reached to dst break;
                break;
        }

        return minPathCost == Integer.MAX_VALUE ? -1 : minPathCost;
    }

    private Map<Integer, List<int[]>> createGraph(int[][] flights) {
        Map<Integer, List<int[]>> graph = new HashMap<>(); // direct stops + cost to reach that stop
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new ArrayList<>());
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }
        return graph;
    }
}
