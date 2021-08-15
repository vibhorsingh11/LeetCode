package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of
 * s such that every character in t (including duplicates) is included in the window.
 * <p>
 * If there is no such substring, return the empty string "".
 * <p>
 * The testcases will be generated such that the answer is unique.
 * <p>
 * A substring is a contiguous sequence of characters within the string.
 * <p>
 * Constraints:
 * <p>
 * m == s.length
 * n == t.length
 * 1 <= m, n <= 10^5
 * s and t consist of uppercase and lowercase English letters.
 * <p>
 * Follow up: Could you find an algorithm that runs in O(m + n) time?
 */

public class Problem15_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            return "";
        }
        Map<Character, Integer> tFrequency = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFrequency.put(c, tFrequency.getOrDefault(c, 0) + 1);
        }
        int count = tFrequency.size();
        int left = 0;
        int right = s.length() - 1;
        int i = 0;
        int j = 0;
        int minWindowLength = s.length();
        boolean found = false;
        while (j < s.length()) {
            char end = s.charAt(j);
            j++;
            if (tFrequency.containsKey(end)) {
                tFrequency.put(end, tFrequency.get(end) - 1);
                if (tFrequency.get(end) == 0) {
                    count--;
                }
            }
            if (count > 0) {
                continue;
            }
            while (count == 0) {
                char start = s.charAt(i);
                i++;
                if (tFrequency.containsKey(start)) {
                    tFrequency.put(start, tFrequency.get(start) + 1);
                    if (tFrequency.get(start) > 0) {
                        count++;
                    }
                }
            }
            if (j - i < minWindowLength) {
                left = i;
                right = j;
                minWindowLength = j - i;
                found = true;
            }
        }
        return found ? s.substring(left - 1, right) : "";
    }
}
