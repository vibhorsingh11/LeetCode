package org.phoenix.leetcode.challenges;

/*
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.
 *
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1,
 * which is expressed as a pair: [0,1]
 *
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 *
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem29_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites.length == 0) {
            return true;
        }
        // Track visited courses
        int[] visited = new int[numCourses];
        // Map will store that which course depends on which course
        Map<Integer, List<Integer>> courseMap = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            if (courseMap.containsKey(prerequisite[1])) {
                courseMap.get(prerequisite[1]).add(prerequisite[0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(prerequisite[0]);
                courseMap.put(prerequisite[1], list);
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if (dfs(courseMap, visited, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(Map<Integer, List<Integer>> courseMap, int[] visited, int i) {
        if (visited[i] == -1) {
            return true;
        }
        if (visited[i] == 1) {
            return false;
        }
        visited[i] = -1;
        if (courseMap.containsKey(i)) {
            for (int j : courseMap.get(i)) {
                if (dfs(courseMap, visited, j)) {
                    return true;
                }
            }
        }
        visited[i] = 1;
        return false;
    }
}
