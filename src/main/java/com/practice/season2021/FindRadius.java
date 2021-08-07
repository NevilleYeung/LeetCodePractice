package com.practice.season2021;

import java.util.Arrays;

/**
 * 475. 供暖器
 * 二分
 * https://leetcode-cn.com/problems/heaters/
 */
public class FindRadius {
    /*
    冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
    在加热器的加热半径范围内的每个房屋都可以获得供暖。
    现在，给出位于一条水平线上的房屋 houses 和供暖器 heaters 的位置，请你找出并返回可以覆盖所有房屋的最小加热半径。
    说明：所有供暖器都遵循你的半径标准，加热的半径也一样。

    示例 1:
    输入: houses = [1,2,3], heaters = [2]
    输出: 1
    解释: 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。

    示例 2:
    输入: houses = [1,2,3,4], heaters = [1,4]
    输出: 1
    解释: 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。

    示例 3：
    输入：houses = [1,5], heaters = [2]
    输出：3

    提示：
    1 <= houses.length, heaters.length <= 3 * 104
    1 <= houses[i], heaters[i] <= 109
     */
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int left = 0;    // TODO houses 和 heaters 位置相同时，距离是0
        int right = Math.max(houses[houses.length - 1], heaters[heaters.length - 1]);
        int midd = 0;
        int ans = 0;

        while (left <= right) {
            midd = left + (right - left) / 2;

            if (isCover(houses, heaters, midd)) {
                ans = midd;
                right = midd - 1;
            } else {
                left = midd + 1;
            }
        }

        return ans;
    }

    private boolean isCover(int[] houses, int[] heaters, int len) {
        int houseIndex = 0;
        for (int heater : heaters) {
            while (houseIndex < houses.length) {
                if (heater - len <= houses[houseIndex] && houses[houseIndex] <= heater + len) {
                    houseIndex++;
                } else {
                    break;
                }
            }

            if (houseIndex == houses.length) {
                return true;
            }
        }

        return false;
    }

//    private boolean isCover(int[] houses, int[] heaters, int ans) {
//        for (int house : houses) {
//            if (house < heaters[0] - ans || heaters[heaters.length - 1] < house) {
//                return false;
//            }
//
//            boolean isOk = false;
//            int left = 0;
//            int right = heaters.length - 1;
//            int midd = 0;
//            while (left <= right) {
//                midd = left + (right - left) / 2;
//                if (heater[] - ans <= house && house <= heater + ans) {
//                    isOk = true;
//                    break;
//                }
//            }
//
//            if (!isOk) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    /**
     * 会超时
     */
    private boolean isCover1(int[] houses, int[] heaters, int len) {
        for (int house : houses) {
            boolean isOk = false;
            for (int heater : heaters) {
                if (heater - len <= house && house <= heater + len) {
                    isOk = true;
                    break;
                }
            }

            if (!isOk) {
                return false;
            }
        }

        return true;
    }
}
