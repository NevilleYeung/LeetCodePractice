package com.practice.season2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 双指针
 * https://leetcode-cn.com/problems/3sum/
 */
public class ThreeSum {
    /*
    给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
    注意：答案中不可以包含重复的三元组。

    示例 1：
    输入：nums = [-1,0,1,2,-1,-4]
    输出：[[-1,-1,2],[-1,0,1]]

    示例 2：
    输入：nums = []
    输出：[]

    示例 3：
    输入：nums = [0]
    输出：[]

    提示：
    0 <= nums.length <= 3000
    -105 <= nums[i] <= 105
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> re = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return re;
        }

        // 排序即可避免重复解
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                // 跳过重复的值，避免重复解
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (left > i + 1) {
                    // 跳过重复的值，避免重复解
                    if (nums[left] == nums[left - 1]) {
                        left++;
                        continue;
                    }
                }
                if (right < nums.length - 1) {
                    // 跳过重复的值，避免重复解
                    if (nums[right] == nums[right + 1]) {
                        right--;
                        continue;
                    }
                }

                if (nums[left] + nums[right] < -nums[i]) {
                    left++;
                } else if (nums[left] + nums[right] > -nums[i]) {
                    right--;
                } else {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    re.add(tmp);

                    left++;
                }
            }
        }

        return re;
    }
}
