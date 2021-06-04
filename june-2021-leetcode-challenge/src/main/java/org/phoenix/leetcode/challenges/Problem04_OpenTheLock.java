package org.phoenix.leetcode.challenges;

import java.util.*;

/**
 * You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.
 * <p>
 * The lock initially starts at '0000', a string representing the state of the 4 wheels.
 * <p>
 * You are given a list of deadends dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.
 * <p>
 * Given a target representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.
 * Constraints:
 * <p>
 * 1 <= deadends.length <= 500
 * deadends[i].length == 4
 * target.length == 4
 * target will not be in the list deadends.
 * target and deadends[i] consist of digits only.
 */

public class Problem04_OpenTheLock {
    public int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        if (deadSet.contains(target) || deadSet.contains("0000")) {
            return -1;
        }
        if (target.equals("0000")) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size --> 0) {
                String curr = queue.poll();
                for (int pos = 0; pos < 4; pos++) {
                    char[] chars = new char[0];
                    if (curr != null) {
                        chars = curr.toCharArray();
                    }
                    chars[pos] = (char) ((chars[pos] + 11 - '0') % 10 + '0');
                    String nextString = String.valueOf(chars);
                    if (nextString.equals(target)) {
                        return step + 1;
                    }
                    if (!deadSet.contains(nextString)) {
                        queue.offer(nextString);
                        deadSet.add(nextString);
                    }
                    chars[pos] = (char) ((chars[pos] + 8 - '0') % 10 + '0');
                    nextString = String.valueOf(chars);
                    if (nextString.equals(target)) {
                        return step + 1;
                    }
                    if (!deadSet.contains(nextString)) {
                        queue.offer(nextString);
                        deadSet.add(nextString);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
