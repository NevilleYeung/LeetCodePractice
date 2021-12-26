package com.questionbank.a800to899;

/**
 * 875. 爱吃香蕉的珂珂
 * 二分
 * https://leetcode-cn.com/problems/koko-eating-bananas/
 */
public class MinEatingSpeed875 {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int left = 1;
        int right = 1000000000; // piles[i]最大值
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            // 找到左边界
            if (isOK(mid, piles, h)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean isOK(int ans, int[] piles, int h) {
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % ans == 0) {
                h = h - piles[i] / ans;
            } else {
                h = h - piles[i] / ans - 1;
            }

            if (h < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MinEatingSpeed875 me = new MinEatingSpeed875();

        // 示例 1：
        //输入: piles = [3,6,7,11], H = 8
        //输出: 4
        int[] piles = {3,6,7,11};
        int H = 8;
        int ans = me.minEatingSpeed(piles, H);
        System.out.println(ans);

        //示例 2：
        //输入: piles = [30,11,23,4,20], H = 5
        //输出: 30
        piles = new int[]{30,11,23,4,20};
        H = 5;
        ans = me.minEatingSpeed(piles, H);
        System.out.println(ans);

        //示例 3：
        //输入: piles = [30,11,23,4,20], H = 6
        //输出: 23
        piles = new int[]{30,11,23,4,20};
        H = 6;
        ans = me.minEatingSpeed(piles, H);
        System.out.println(ans);
    }
}
