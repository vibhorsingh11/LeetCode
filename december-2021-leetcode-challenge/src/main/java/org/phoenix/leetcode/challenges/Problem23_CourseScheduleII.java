package org.phoenix.leetcode.challenges;

import java.util.LinkedList;
import java.util.Queue;

/**
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * <p>
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.
 * Constraints:
 * <p>
 * 1 <= numCourses <= 2000
 * 0 <= prerequisites.length <= numCourses * (numCourses - 1)
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * ai != bi
 * All the pairs [ai, bi] are distinct.
 */

public class Problem23_CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return null;
        int[] indegree = new int[numCourses];
        int[] order = new int[numCourses];
        int index = 0;
        for (int[] ints : prerequisites) indegree[ints[0]]++;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            if (indegree[i] == 0) {
                order[index++] = i;
                queue.offer(i);
            }
        while (!queue.isEmpty()) {
            int prerequisite = queue.poll();
            for (int[] ints : prerequisites) {
                if (ints[1] == prerequisite) {
                    indegree[ints[0]]--;
                    if (indegree[ints[0]] == 0) {
                        order[index++] = ints[0];
                        queue.offer(ints[0]);
                    }
                }
            }
        }
        return (index == numCourses) ? order : new int[0];
    }
}
