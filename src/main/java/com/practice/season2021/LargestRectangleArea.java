package com.practice.season2021;

import java.util.*;

/**
 * 84. 柱状图中最大的矩形
 * [单调栈]
 * https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 */
public class LargestRectangleArea {
    /*
    给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
    求在该柱状图中，能够勾勒出来的矩形的最大面积。
    // 图略
    以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。
    // 图略
    图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。


    示例:
    输入: [2,1,5,6,2,3]
    输出: 10
     */
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int maxArea = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
        //放置一个冗余元素方便计算
        stack.push(-1);
        for (int i = 0; i < heights.length; i++) {
            // 保证stack内的柱体高度是单调递增（或相等）的
            while (stack.peek() != -1 && heights[i] < heights[stack.peek()]) {
                int top = stack.pop();
                int width = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, heights[top] * width); // 计算出山字形柱体中，中间突出柱体的面积
            }
            stack.push(i);
        }

        // 此时stack内的柱体高度都是单调递增或者相等
        while (stack.peek() != -1) {
            int area = heights[stack.pop()] * (heights.length - stack.peek() - 1); // 计算每个柱体所能占的最大面积
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;

    }

    public int largestRectangleArea2(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }

        int left = 0;
        int right = 0;
        int maxArea = 0;
        int size = 0;

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        while (left < heights.length) {
            for (right = left; right < heights.length; right++) {
                if (heights[right] == 0)
                {
                    size = 0;
                    break;
                }

                tm.put(heights[right], 0);
                size++;
                maxArea = Math.max(maxArea, tm.firstKey() * size);
            }

            tm.clear();
            size = 0;
            left++;
        }

        return maxArea;
    }

    public int largestRectangleArea1(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int left = 0;
        int right = 0;
        int maxArea = 0;

        while (left < heights.length) {
            for (right = left; right < heights.length; right++) {
                if (heights[right] == 0)
                {
                    break;
                }

                pq.add(heights[right]);
                maxArea = Math.max(maxArea, pq.peek() * pq.size());
            }

            pq.clear();
            left++;
        }

        return maxArea;
    }
}
