package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string num that contains only digits and an integer target, return all possibilities to add the binary operators '+', '-', or '*' between the digits of num so that the resultant expression evaluates to the target value.
 * Constraints:
 * <p>
 * 1 <= num.length <= 10
 * num consists of only digits.
 * -231 <= target <= 231 - 1
 */

public class Problem18_ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> expressions = new ArrayList<>();
        if (num == null || num.isEmpty()) {
            return expressions;
        }
        evaluateExpressions(num, 0, target, 0, 0, "", expressions);
        return expressions;
    }

    private void evaluateExpressions(String num,
                                     int start,
                                     int target,
                                     long currentSum,
                                     long previousNumber,
                                     String currentResult,
                                     List<String> expressions) {
        if (start == num.length() && currentSum == target) {
            expressions.add(currentResult);
            return;
        }
        if (start == num.length()) {
            return;
        }
        for (int i = start; i < num.length(); i++) {
            String currentString = num.substring(start, i + 1);
            if (currentString.length() > 1 && currentString.charAt(0) == '0') {
                break;
            }
            long numericValue = Long.parseLong(currentString);
            if (currentResult.isEmpty()) {
                evaluateExpressions(num,
                        i + 1,
                        target,
                        numericValue,
                        numericValue,
                        currentString,
                        expressions);
            } else {
                evaluateExpressions(num,
                        i + 1,
                        target,
                        currentSum - previousNumber + previousNumber * numericValue,
                        previousNumber * numericValue,
                        currentResult + "*" + numericValue,
                        expressions);
                evaluateExpressions(num,
                        i + 1,
                        target,
                        currentSum + numericValue,
                        numericValue,
                        currentResult + "+" + numericValue,
                        expressions);
                evaluateExpressions(num,
                        i + 1,
                        target,
                        currentSum - numericValue,
                        -numericValue,
                        currentResult + "-" + numericValue,
                        expressions);
            }
        }
    }
}
