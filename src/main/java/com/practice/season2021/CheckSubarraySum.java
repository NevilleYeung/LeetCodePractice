package com.practice.season2021;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. 连续的子数组和
 * 前缀和
 * https://leetcode-cn.com/problems/continuous-subarray-sum/
 */
public class CheckSubarraySum {
    /*
    给定一个包含 非负数 的数组和一个目标 整数 k ，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，且总和为 k 的倍数，即总和为 n * k ，其中 n 也是一个整数。

    示例 1：
    输入：[23,2,4,6,7], k = 6
    输出：True
    解释：[2,4] 是一个大小为 2 的子数组，并且和为 6。

    示例 2：
    输入：[23,2,6,4,7], k = 5
    输出：True
    解释：[23,2,6,4,7]是大小为 5 的子数组，并且和为 42。

    说明：
    数组的长度不会超过 10,000 。
    你可以认为所有数字总和在 32 位有符号整数范围内。
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        /*
        前缀和的mode相同，则相减得到的子数组就能被k整除。

        (1 + 2 + 3 ) % k = mode
        (1 + 2 + 3 + 4 + 5) % k = mode

        (1 + 2 + 3 + 4 + 5) % k = (1 + 2 + 3 ) % k
        ( (1 + 2 + 3 + 4 + 5) - (1 + 2 + 3 ) ) % k = 0
         */
        int prefix = 0;
        int zeroIndex = Integer.MAX_VALUE;
        Map<Integer, Integer> modeMap = new HashMap<>(); // key=mode,value=index
        modeMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroIndex != Integer.MAX_VALUE) {
                    if (i - zeroIndex == 1) {
                        return true;
                    }
                }
                zeroIndex = i;
            }

            prefix = prefix + nums[i];
            if (prefix == 0) {
                continue;
            }
            int mode = prefix % k;

            if (modeMap.get(mode) != null) {
                if (i - modeMap.get(mode) >= 2) {
                    return true;
                }
            } else {
                modeMap.put(mode, i);
            }
        }

        return false;
    }

    // 会超时
    public boolean checkSubarraySum2(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        int [] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            for (int j = i + 2; j < prefix.length; j++) {
                if ((prefix[j] - prefix[i]) % k == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkSubarraySum1(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);

        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            // 计算前缀和
            prefix = prefix + nums[i];

            // 将前缀和的次数存入map
            if (prefixMap.get(prefix) == null) {
                prefixMap.put(prefix, 1);
            } else {
                prefixMap.put(prefix, prefixMap.get(prefix) + 1);
            }

//            Set<Integer> keySet = prefixMap.keySet();
//            Iterator<Integer> iterator = keySet.iterator();
//            while (iterator.hasNext()) {
//                if ((prefix - iterator.next()) % k == 0) {
//                    return true;
//                }
//            }
        }

        return false;
    }
}
