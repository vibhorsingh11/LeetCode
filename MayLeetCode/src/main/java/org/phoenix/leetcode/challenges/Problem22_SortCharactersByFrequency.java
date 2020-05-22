package org.phoenix.leetcode.challenges;

/*
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 * Example 1:
 * Input:
 * "tree"
 *
 * Output:
 * "eert"
 *
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 */

public class Problem22_SortCharactersByFrequency {
    public String frequencySort(String s) {
        // created an array maintain frequency of characters
        int[] arr = new int[128];
        StringBuilder sb = new StringBuilder();
        // incrementing the count of characters
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        while (sb.length() < s.length()) {
            char max = 0;
            for (char i = 0; i < arr.length; i++) {
                if (arr[i] > arr[max]) max = i;
            }
            while (arr[max] > 0) {
                sb.append(max);
                arr[max]--;
            }
        }
        return sb.toString();
    }
}
