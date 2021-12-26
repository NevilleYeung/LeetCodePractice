package com.questionbank.a1200to1299;

/**
 * 1283. 使结果不超过阈值的最小除数
 * 二分
 * https://leetcode-cn.com/problems/find-the-smallest-divisor-given-a-threshold/
 */
public class SmallestDivisor1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans = 0;
        int left = 1;
        int right = 1000000; // nums[i]最大值
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            // 找到左边界
            if (isOK(mid, nums, threshold)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean isOK(int ans, int[] nums, int threshold) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % ans == 0) {
                threshold = threshold - nums[i] / ans;
            } else {
                threshold = threshold - nums[i] / ans - 1;
            }

            if (threshold < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SmallestDivisor1283 sd = new SmallestDivisor1283();

        // 示例 1：
        //输入：nums = [1,2,5,9], threshold = 6
        //输出：5
        //解释：如果除数为 1 ，我们可以得到和为 17 （1+2+5+9）。
        //如果除数为 4 ，我们可以得到和为 7 (1+1+2+3) 。如果除数为 5 ，和为 5 (1+1+1+2)。
        int[] nums = {1,2,5,9};
        int threshold = 6;
        int ans = sd.smallestDivisor(nums, threshold);
        System.out.println(ans);

        //示例 2：
        //输入：nums = [2,3,5,7,11], threshold = 11
        //输出：3
        nums = new int[]{2,3,5,7,11};
        threshold = 11;
        ans = sd.smallestDivisor(nums, threshold);
        System.out.println(ans);

        //示例 3：
        //输入：nums = [19], threshold = 5
        //输出：4
        nums = new int[]{19};
        threshold = 5;
        ans = sd.smallestDivisor(nums, threshold);
        System.out.println(ans);

    }
}
