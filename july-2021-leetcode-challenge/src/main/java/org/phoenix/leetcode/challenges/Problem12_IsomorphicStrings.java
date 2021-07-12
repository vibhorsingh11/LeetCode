package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */

public class Problem12_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        // Lengths of the strings
        int m = s.length();
        int n = t.length();
        // If lengths are not equal, return false
        if (m != n) {
            return false;
        }
        // Mapping of characters of s and t.
        Map<Character, Character> stMapping = new HashMap<>();
        boolean[] visited = new boolean[256];

        for (int i = 0; i < m; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (stMapping.containsKey(a)) {
                if (stMapping.get(a) != b) {
                    return false;
                }
            } else {
                if (visited[b]) {
                    return false;
                }
                stMapping.put(a, b);
                visited[b] = true;
            }
        }
        return true;
    }
}
