package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * There are n different online courses numbered from 1 to n. You are given an array courses where courses[i] = [durationi, lastDayi] indicate that the ith course should be taken continuously for durationi days and must be finished before or on lastDayi.
 * <p>
 * You will start on the 1st day and you cannot take two or more courses simultaneously.
 * <p>
 * Return the maximum number of courses that you can take.
 * <p>
 * Example 1:
 * <p>
 * Input: courses = [[100,200],[200,1300],[1000,1250],[2000,3200]]
 * Output: 3
 * Explanation:
 * There are totally 4 courses, but you can take 3 courses at most:
 * First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
 * Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day.
 * Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day.
 * The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.
 * Example 2:
 * <p>
 * Input: courses = [[1,2]]
 * Output: 1
 * Example 3:
 * <p>
 * Input: courses = [[3,2],[4,3]]
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= courses.length <= 104
 * 1 <= durationi, lastDayi <= 104
 */

public class Problem02_CourseScheduleIII {
    // O(nlogn)
    public int scheduleCourse(int[][] courses) {
        // Sorting the array with highest lastDay
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        // Queue to store selected durations
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> (b - a));
        // Time Elapsed till now
        int timeElapsed = 0;
        // Looping over the courses
        for (int[] course : courses) {
            // time elapsed and course duration is less than
            // last day time
            if (timeElapsed + course[0] <= course[1]) {
                pQueue.add(course[0]);
                timeElapsed += course[1];
            } else if (!pQueue.isEmpty() && pQueue.peek() > course[0]) {
                timeElapsed -= pQueue.poll();
                pQueue.add(course[0]);
                timeElapsed += course[0];
            }
        }
        return pQueue.size();
    }
}
