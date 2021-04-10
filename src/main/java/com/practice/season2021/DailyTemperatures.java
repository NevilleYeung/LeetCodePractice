package com.practice.season2021;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 739. 每日温度
 * 单调栈
 * https://leetcode-cn.com/problems/daily-temperatures/
 */
public class DailyTemperatures {
    /*
    请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。

    例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
    提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
     */
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) {
            return null;
        }

        // 通过单调栈的方式解决
        int[] re = new int[T.length];
        // stack里面存着温度单调递减的 数组下标
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int top = stack.pop();
                re[top] = i - top;
            }

            stack.push(i);
        }

        return re;
    }
}
