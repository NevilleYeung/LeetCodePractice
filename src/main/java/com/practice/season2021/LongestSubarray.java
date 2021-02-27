package com.practice.season2021;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 1438. 绝对差不超过限制的最长连续子数组
 * https://leetcode-cn.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
 */
public class LongestSubarray {

    /*
    给你一个整数数组 nums ，和一个表示限制的整数 limit，请你返回最长连续子数组的长度，该子数组中的任意两个元素之间的绝对差必须小于或者等于 limit 。
    如果不存在满足条件的子数组，则返回 0 。

    示例 1：
    输入：nums = [8,2,4,7], limit = 4
    输出：2
    解释：所有子数组如下：
    [8] 最大绝对差 |8-8| = 0 <= 4.
    [8,2] 最大绝对差 |8-2| = 6 > 4.
    [8,2,4] 最大绝对差 |8-2| = 6 > 4.
    [8,2,4,7] 最大绝对差 |8-2| = 6 > 4.
    [2] 最大绝对差 |2-2| = 0 <= 4.
    [2,4] 最大绝对差 |2-4| = 2 <= 4.
    [2,4,7] 最大绝对差 |2-7| = 5 > 4.
    [4] 最大绝对差 |4-4| = 0 <= 4.
    [4,7] 最大绝对差 |4-7| = 3 <= 4.
    [7] 最大绝对差 |7-7| = 0 <= 4.
    因此，满足题意的最长子数组的长度为 2 。

    示例 2：
    输入：nums = [10,1,2,4,7,2], limit = 5
    输出：4
    解释：满足题意的最长子数组是 [2,4,7,2]，其最大绝对差 |2-7| = 5 <= 5 。

    示例 3：
    输入：nums = [4,2,2,2,4,4,2,2], limit = 0
    输出：3

    提示：
    1 <= nums.length <= 10^5
    1 <= nums[i] <= 10^9
    0 <= limit <= 10^9
     */
//    public int longestSubarray(int[] nums, int limit) {
//        if (nums == null || nums.length < 1) {
//            return 0;
//        } else if (nums.length == 1) {
//            // 0 <= limit <= 10^9
//            return 1;
//        }
//
//        int right = 0;
//        int result = 0;
//        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
//        PriorityQueue<Integer> min = new PriorityQueue<>(Comparator.naturalOrder());
//
//        for (int left = 0; left < nums.length; left++) {
//            max.offer(nums[left]);
//            min.offer(nums[left]);
//
//            for (right = left + 1; right < nums.length; right++) {
//                max.offer(nums[right]);
//                min.offer(nums[right]);
//
//                int tmpSub = max.peek() - min.peek();
//                if (tmpSub <= limit) {
//                    result = Math.max(result, right - left + 1);
//                } else {
//                    break;
//                }
//            }
//
//            max.clear();
//            min.clear();
//        }
//
//        return result;
//    }

    public int longestSubarray(int[] nums, int limit) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        int result = 0;
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>(Comparator.naturalOrder());

        int left = 0;
        int right = 0;

        while (left < nums.length && right < nums.length) {
            max.offer(nums[right]);
            min.offer(nums[right]);

            if (max.peek() - min.peek() <= limit) {
                result = Math.max(result, right - left + 1);
                right++;
                continue;
            }

            max.remove(nums[left]);
            min.remove(nums[left]);

            left++;
            right++; // 计算最长的符合要求的子串，所以前面的子串计算可以沿用
        }

        return result;
    }

//    public int longestSubarray(int[] nums, int limit) {
//        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
//        int n = nums.length;
//        int left = 0, right = 0;
//        int ret = 0;
//        while (right < n) {
//            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
//            while (map.lastKey() - map.firstKey() > limit) {
//                map.put(nums[left], map.get(nums[left]) - 1);
//                if (map.get(nums[left]) == 0) {
//                    map.remove(nums[left]);
//                }
//                left++;
//            }
//            ret = Math.max(ret, right - left + 1);
//            right++;
//        }
//        return ret;
//
//    }
}
