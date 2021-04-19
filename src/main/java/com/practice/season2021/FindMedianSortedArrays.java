package com.practice.season2021;

import java.util.Arrays;

/**
 * 4. 寻找两个正序数组的中位数
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */
public class FindMedianSortedArrays {
    /*
    给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

    示例 1：
    输入：nums1 = [1,3], nums2 = [2]
    输出：2.00000
    解释：合并数组 = [1,2,3] ，中位数 2

    示例 2：
    输入：nums1 = [1,2], nums2 = [3,4]
    输出：2.50000
    解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5

    示例 3：
    输入：nums1 = [0,0], nums2 = [0,0]
    输出：0.00000

    示例 4：
    输入：nums1 = [], nums2 = [1]
    输出：1.00000

    示例 5：
    输入：nums1 = [2], nums2 = []
    输出：2.00000

    提示：
    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -106 <= nums1[i], nums2[i] <= 106

    进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = 0;
        int len2 = 0;
        if (nums1 != null && nums1.length > 0) {
            len1 = nums1.length;
        }
        if (nums2 != null && nums2.length > 0) {
            len2 = nums2.length;
        }
        if (len1 == 0 && len2 == 0) {
            return 0.00000d;
        }



        int [] array = new int[len1 +  len2];
        if (nums1 != null) {
            for (int i = 0; i < len1; i++) {
                array[i] = nums1[i];
            }
        }
        if (nums2 != null) {
            for (int i = 0; i < len2; i++) {
                array[len1 + i] = nums2[i];
            }
        }

        Arrays.sort(array);


        if (array.length % 2 == 1) {
            int mid = array.length >> 1;
            return array[mid];
        } else {
            int mid = array.length >> 1;
            double re = ((double) array[mid] + (double) array[mid - 1]) / 2d;

            return re;
        }
    }
}
