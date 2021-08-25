package org.phoenix.leetcode.challenges;

/**
 * Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
 * <p>
 * Constraints:
 * <p>
 * 0 <= c <= 231 - 1
 */

public class Problem25_SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int firstNumber = 0;
        int secondNumber = (int) Math.sqrt(c);

        while (firstNumber <= secondNumber) {
            int total = (firstNumber * firstNumber) + (secondNumber * secondNumber);

            //If currentTotal is equals to the target
            if (total == c)
                return true;

            //If currentTotal is greater than the target reduce the secondNumber
            if (total > c)
                secondNumber--;

                //increment the firstNumber if currentTotal is lesser than the target
            else
                firstNumber++;
        }

        //If we are unable to find two numbers equal to target
        return false;
    }
}
