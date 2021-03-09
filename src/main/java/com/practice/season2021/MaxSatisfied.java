package com.practice.season2021;

import java.util.TreeMap;

/**
 * 1052. 爱生气的书店老板
 * https://leetcode-cn.com/problems/grumpy-bookstore-owner/
 */
public class MaxSatisfied {
    /*
    今天，书店老板有一家店打算试营业 customers.length 分钟。每分钟都有一些顾客（customers[i]）会进入书店，所有这些顾客都会在那一分钟结束后离开。
    在某些时候，书店老板会生气。 如果书店老板在第 i 分钟生气，那么 grumpy[i] = 1，否则 grumpy[i] = 0。 当书店老板生气时，那一分钟的顾客就会不满意，不生气则他们是满意的。
    书店老板知道一个秘密技巧，能抑制自己的情绪，可以让自己连续 X 分钟不生气，但却只能使用一次。
    请你返回这一天营业下来，最多有多少客户能够感到满意的数量。

    示例：
    输入：customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
    输出：16
    解释：
    书店老板在最后 3 分钟保持冷静。
    感到满意的最大客户数量 = 1 + 1 + 1 + 1 + 7 + 5 = 16.

    提示：
    1 <= X <= customers.length == grumpy.length <= 20000
    0 <= customers[i] <= 1000
    0 <= grumpy[i] <= 1
     */
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        if (customers == null || customers.length == 0) {
            return 0;
        }

        int left = 0;
        int right = 0;

        int sumZero = 0;
        int grum = 0;
        int grumMax = 0;

        // 计算出所有不受老板脾气影响的客户数
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sumZero = sumZero + customers[i];
            }
        }

        while (right < customers.length) {
            for (; right < left + X; right++) {
                if (grumpy[right] == 1) {
                    grum = grum + customers[right];
                }
            }

            // X能覆盖的最多被影响客户
            if (grumMax < grum) {
                grumMax = grum;
            }

            if (grumpy[left] == 1) {
                grum = grum - customers[left];
            }

            left++;

        }

//        System.out.println("sumZero=" + sumZero + ", grumMax=" + grumMax);

        return sumZero + grumMax;
    }
}
