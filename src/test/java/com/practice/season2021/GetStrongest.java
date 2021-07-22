package com.practice.season2021;

import java.util.Arrays;

/**
 * 1471. 数组中的 k 个最强值
 * 双指针
 * https://leetcode-cn.com/problems/the-k-strongest-values-in-an-array/
 */
public class GetStrongest {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int midNum = arr[(arr.length - 1) / 2];

        int[] ans = new int[k];

        int num = 0;
        int left = 0;
        int right = arr.length - 1;
        while (num < k) {
            if (isleftBigger(midNum, arr[left], arr[right])) {
                ans[num] = arr[left];
                left++;
            } else {
                ans[num] = arr[right];
                right--;
            }
            num++;
        }

        return ans;
    }

    private boolean isleftBigger(int midNum, int leftNum, int rightNum) {
        int leftAbs = Math.abs(leftNum - midNum);
        int rightAbs = Math.abs(rightNum - midNum);
        if (leftAbs > rightAbs) {
            return true;
        } else if (leftAbs == rightAbs) {
            if (leftNum > rightNum) {
                return true;
            }
        }

        return false;
    }
}
