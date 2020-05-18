package org.phoenix.leetcode.challenges;

/*
* Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
*  In other words, one of the first string's permutations is the substring of the second string.
*
* Example 1:
* Input: s1 = "ab" s2 = "eidbaooo"
* Output: True
* Explanation: s2 contains one permutation of s1 ("ba").
*
* Example 2:
* Input:s1= "ab" s2 = "eidboaoo"
* Output: False
*/

public class Problem18_PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        // created two array to track both strings characters
        int[] s1map = new int[26];
        int[] s2map = new int[26];
        // increasing the count on found index
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            // checking if both array have same values
            if (matches(s1map, s2map))
                return true;
            s2map[s2.charAt(i + s1.length()) - 'a']++;
            s2map[s2.charAt(i) - 'a']--;
        }
        return matches(s1map, s2map);
    }
    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
}
