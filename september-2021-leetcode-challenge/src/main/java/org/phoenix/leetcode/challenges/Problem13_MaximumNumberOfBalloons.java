package org.phoenix.leetcode.challenges;

/**
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * <p>
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 * Constraints:
 * <p>
 * 1 <= text.length <= 104
 * text consists of lower case English letters only.
 */

public class Problem13_MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        int min = chars[1];
        min = Math.min(min, chars[0]);
        min = Math.min(min, chars[11] / 2);
        min = Math.min(min, chars[14] / 2);
        min = Math.min(min, chars[13]);
        return min;
    }
}
