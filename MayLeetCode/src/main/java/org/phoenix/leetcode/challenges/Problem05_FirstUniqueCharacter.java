package org.phoenix.leetcode.challenges;

/*
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 */

import java.util.HashMap;
import java.util.Map;

public class Problem05_FirstUniqueCharacter {

    public int firstUniqueChar(String s) {
        // hashmap for storing character and count
        Map<Character, Integer> map = new HashMap<>();
        // looping over string and pushing 0 if not present else increment count by one
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // checking first character with count equal to 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        // if not found then return 0
        return -1;
    }
}
