/*
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.
 * Return a list of all possible strings we could create. You can return the output in any order.
 *
 * Example 1:
 * Input: S = "a1b2"
 * Output: ["a1b2","a1B2","A1b2","A1B2"]
 * Constraints:
 * S will be a string with length between 1 and 12.
 * S will consist only of letters or digits.
 */
package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

public class Problem16_LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        if (S.length() == 0) {
            return ans;
        }
        helper(S.toCharArray(), ans, 0);
        return ans;
    }

    private void helper(char[] str, List<String> ans, int index) {
        if (index == str.length) {
            ans.add(new String(str));
            return;
        }

        if (!Character.isDigit(str[index])) {
            str[index] = Character.toLowerCase(str[index]);
            helper(str, ans, index + 1);


            str[index] = Character.toUpperCase(str[index]);
        }
        helper(str, ans, index + 1);
    }
}
