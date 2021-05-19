package com.practice.season2021;

/**
 * 11. 盛最多水的容器
 * 双指针
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {
    /*
    给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

    说明：你不能倾斜容器。
    示例 1：
    // 图略
    输入：[1,8,6,2,5,4,8,3,7]
    输出：49
    解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。

    示例 2：
    输入：height = [1,1]
    输出：1

    示例 3：
    输入：height = [4,3,2,1,4]
    输出：16

    示例 4：
    输入：height = [1,2,1]
    输出：2

    提示：
        n = height.length
        2 <= n <= 3 * 104
        0 <= height[i] <= 3 * 104
     */

    // 暴力解法，会超时
    public int maxArea1(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            }
        }

        return maxArea;
    }

    /**
     * 双指针解法
     * 1、长度尽量长
     * 2、最大面积取决于最短边
     *
     * @param height height
     * @return maxArea
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
