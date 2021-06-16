package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 8
 */

public class Problem16_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrackHelper(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    public void backtrackHelper(List<String> list, StringBuilder str, int open, int closed, int n) {
        // Base condition
        if (closed > open) {
            return;
        }

        if (closed == open && str.length() == n * 2) {
            list.add(str.toString());
            return;
        }

        if (open < n) {
            str.append("(");
            backtrackHelper(list, str, open + 1, closed, n);
            str.deleteCharAt(str.length() - 1);
        }
        if (closed < open) {
            str.append(")");
            backtrackHelper(list, str, open, closed + 1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
