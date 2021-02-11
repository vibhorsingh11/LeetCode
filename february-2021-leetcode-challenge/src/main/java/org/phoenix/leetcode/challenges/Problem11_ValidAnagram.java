/*
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
package org.phoenix.leetcode.challenges;

public class Problem11_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // checking if length are not equal
        if (s.length() != t.length()) {
            return false;
        }
        // array to store the count
        int[] arr = new int[26];
        // looping both strings
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        // looping array to check count
        for (int value : arr) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
