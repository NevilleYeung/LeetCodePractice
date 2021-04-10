package com.practice.season2021;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为K的子数组
 * 前缀和
 * https://leetcode-cn.com/problems/subarray-sum-equals-k/
 */
public class SubarraySum {
    /*
    给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。

    示例 1 :
    输入:nums = [1,1,1], k = 2
    输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
    说明 :
    数组的长度为 [1, 20,000]。
    数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。
     */
    public int subarraySum1(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 计算出前缀和数组，类似斐波那契数列
        int [] prefix = new int[nums.length + 1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        int re = 0;
        for (int i = prefix.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (k == prefix[i] - prefix[j]) {
                    re++;
                }
            }
        }

        return re;
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);  // 保证前缀和与k相等的场景能覆盖
        for(int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if(map.containsKey(pre-k)) {
                // 存在一个数字加上nums[i]结果为K
                count += map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);

        }
        return count;
    }

}
