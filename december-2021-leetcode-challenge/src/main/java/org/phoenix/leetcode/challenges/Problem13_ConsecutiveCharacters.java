package org.phoenix.leetcode.challenges;

/**
 * The power of the string is the maximum length of a non-empty substring that contains only one unique character.
 * <p>
 * Given a string s, return the power of s.
 * Constraints:
 * <p>
 * 1 <= s.length <= 500
 * s consists of only lowercase English letters.
 */

public class Problem13_ConsecutiveCharacters {
    public int maxPower(String s) {
        char x = s.charAt(0);
        if(s.length() == 1) return 1;
        int tempSum = 0, count = 1, max = 0;
        for(int i=1;i<s.length();i++) {
            if(x == s.charAt(i)) {
                count++;
            } else {
                x = s.charAt(i);
                count = 1;
            }
            if(max < count){
                max = count;
            }
        }
        return max;
    }
}
