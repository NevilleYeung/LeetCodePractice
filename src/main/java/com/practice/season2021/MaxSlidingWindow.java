package com.practice.season2021;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 239. 滑动窗口最大值
 * https://leetcode-cn.com/problems/sliding-window-maximum/
 */
public class MaxSlidingWindow {
    /*
    给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
    返回滑动窗口中的最大值。

    示例 1：
    输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
    输出：[3,3,5,5,6,7]
    解释：
    滑动窗口的位置                  最大值
    ---------------               -----
    [1  3  -1] -3  5  3  6  7       3
     1 [3  -1  -3] 5  3  6  7       3
     1  3 [-1  -3  5] 3  6  7       5
     1  3  -1 [-3  5  3] 6  7       5
     1  3  -1  -3 [5  3  6] 7       6
     1  3  -1  -3  5 [3  6  7]      7

    示例 2：
    输入：nums = [1], k = 1
    输出：[1]

    示例 3：
    输入：nums = [1,-1], k = 1
    输出：[1,-1]

    示例 4：
    输入：nums = [9,11], k = 2
    输出：[11]

    示例 5：
    输入：nums = [4,-2], k = 2
    输出：[4]

    提示：
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    1 <= k <= nums.length
     */
    // 这个方法会超时
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int[] re;
        if (nums.length <= k) {
            re = new int[1];
        } else {
            re = new int[nums.length - k + 1];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            for (; right < left + k; right++) {
                pq.add(nums[right]);
            }
            re[left] = pq.peek();
            pq.remove(nums[left]);

            left++;
        }

        return re;
    }

    // 该方法能正常Accepted
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] re;
        if (nums.length <= k) {
            re = new int[1];
        } else {
            re = new int[nums.length - k + 1];
        }

        TreeMap<Integer, Integer> tm = new TreeMap<>(Comparator.reverseOrder());
        int left = 0;
        int right = 0;
        Integer num;

        // 关键处理1
        while (right < nums.length) {
            // 关键处理2
            for (; right < left + k; right++) {
                num = tm.get(nums[right]);
                tm.put(nums[right], num == null ? 1 : num + 1);
            }

            re[left] = tm.firstKey();
            int tmp = tm.get(nums[left]);
            if (tmp <= 1) {
                tm.remove(nums[left]);
            } else {
                tm.put(nums[left], tmp - 1);
            }

            left++;
        }

        return re;
    }
}
