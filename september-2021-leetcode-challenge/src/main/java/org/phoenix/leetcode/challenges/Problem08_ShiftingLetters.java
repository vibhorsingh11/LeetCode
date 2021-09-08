package org.phoenix.leetcode.challenges;

/**
 * You are given a string s of lowercase English letters and an integer array shifts of the same length.
 * <p>
 * Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').
 * <p>
 * For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
 * Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.
 * <p>
 * Return the final string after all such shifts to s are applied.
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 * shifts.length == s.length
 * 0 <= shifts[i] <= 109
 */

public class Problem08_ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder res = new StringBuilder(s);
        for (int i = shifts.length - 2; i >= 0; i--)
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        for (int i = 0; i < s.length(); i++)
            res.setCharAt(i, (char) ((s.charAt(i) - 'a' + shifts[i]) % 26 + 'a'));
        return res.toString();
    }
}
