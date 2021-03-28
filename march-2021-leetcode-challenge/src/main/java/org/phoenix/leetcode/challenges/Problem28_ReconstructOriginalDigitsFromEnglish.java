/**
 * Given a non-empty string containing an out-of-order English representation of digits 0-9, output the digits in ascending order.
 * <p>
 * Note:
 * Input contains only lowercase English letters.
 * Input is guaranteed to be valid and can be transformed to its original digits. That means invalid inputs such as "abc" or "zerone" are not permitted.
 * Input length is less than 50,000.
 * Example 1:
 * Input: "owoztneoer"
 * <p>
 * Output: "012"
 */
package org.phoenix.leetcode.challenges;

public class Problem28_ReconstructOriginalDigitsFromEnglish {
    public String originalDigits(String s) {
        // array to store frequency
        int[] freq = new int[26];
        // looping over the string and storing the frequency
        for (char c : s.toCharArray()) freq[c - 'a']++;
        // StringBuilder for result string/
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[10];
        nums[0] = freq['z' - 'a']; // zero, only for 0
        nums[2] = freq['w' - 'a']; // two, only for 2
        nums[4] = freq['u' - 'a']; // four, only for 4
        nums[6] = freq['x' - 'a']; // siz, only for 6
        nums[8] = freq['g' - 'a']; // eight, only for 8
        nums[1] = freq['o' - 'a'] - nums[0] - nums[2] - nums[4]; //for one, common eo in 0, o in 2 & 4
        nums[5] = freq['f' - 'a'] - nums[4]; //for five, f occurs in 4
        nums[3] = freq['t' - 'a'] - nums[2] - nums[8]; //for three, common e in 2 & 8
        nums[7] = freq['s' - 'a'] - nums[6]; // for seven, common s in 6
        nums[9] = freq['i' - 'a'] - nums[5] - nums[6] - nums[8]; //nine, i in 5,6,8

        for (int i = 0; i < 10; i++)
            sb.append(String.valueOf(i).repeat(Math.max(0, nums[i])));
        return sb.toString();
    }
}
