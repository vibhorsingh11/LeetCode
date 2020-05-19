package org.phoenix.leetcode.challenges;

/*
* Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's price for the current day.

The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.

For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6].



Example 1:

Input: ["StockSpanner","next","next","next","next","next","next","next"], [[],[100],[80],[60],[70],[60],[75],[85]]
Output: [null,1,1,1,2,1,4,6]
Explanation:
First, S = StockSpanner() is initialized.  Then:
S.next(100) is called and returns 1,
S.next(80) is called and returns 1,
S.next(60) is called and returns 1,
S.next(70) is called and returns 2,
S.next(60) is called and returns 1,
S.next(75) is called and returns 4,
S.next(85) is called and returns 6.

* Note that (for example) S.next(75) returned 4, because the last 4 prices
*/

import java.util.Stack;

public class Problem19_OnlineStockSpan {
    Stack<Integer> prices, span;

    public Problem19_OnlineStockSpan() {
        // initialized two stacks
        prices = new Stack();
        span = new Stack();
    }

    public int next(int price) {
        // initialized the
        int s = 1;
        // stack is not empty
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            s += span.pop();
        }

        prices.push(price);
        span.push(s);
        return s;
    }
}
