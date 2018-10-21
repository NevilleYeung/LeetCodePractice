package com.practice.Oct2018;

/**
 * 849. 到最近的人的最大距离
 * https://leetcode-cn.com/problems/maximize-distance-to-closest-person/description/
 *
 */
public class MaximizeDistanceSeats
{
    /*
在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
至少有一个空座位，且至少有一人坐在座位上。
亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
返回他到离他最近的人的最大距离。

示例 1：
输入：[1,0,0,0,1,0,1]
输出：2
解释：
如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
因此，他到离他最近的人的最大距离是 2 。

示例 2：
输入：[1,0,0,0]
输出：3
解释：
如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
这是可能的最大距离，所以答案是 3 。

提示：
    1 <= seats.length <= 20000
    seats 中只含有 0 和 1，至少有一个 0，且至少有一个 1。

 */

    public int maxDistToClosest(int[] seats)
    {
        if (null == seats || seats.length < 2)
        {
            return 0;
        }

        int maxDistance = 0;      // 离最近人的最大距离

        int tmpDistance;          // 当前最大距离
        int tmpLeftIndex = 0;     // 最大距离的左下标

        // 从左至右，找到最大的距离
        for (int i = 0; i < seats.length; i++)
        {
            // 0无人坐
            if (seats[i] == 0)
            {
                // 最后一个位置也需要判断最大距离
                if (i == seats.length - 1)
                {
                    // TODO 重复代码
                    tmpDistance = maxDistance(tmpLeftIndex, i, seats);
                    if (tmpDistance > maxDistance)
                    {
                        maxDistance = tmpDistance;
                    }
                }
            }
            // 1有人坐
            else
            {
                // TODO 重复代码
                tmpDistance = maxDistance(tmpLeftIndex, i, seats);
                if (tmpDistance > maxDistance)
                {
                    maxDistance = tmpDistance;
                }

                // 清理临时数据
                tmpLeftIndex = i;
            }

        }


        return maxDistance;
    }

    /**
     * 离最近人的最大距离
     *
     * @param maxDisLeftIndex
     * @param maxDisRightIndex
     * @param seats
     * @return
     */
    private int maxDistance(int maxDisLeftIndex, int maxDisRightIndex, int seats[])
    {
        if (seats[maxDisLeftIndex] == 0 || seats[maxDisRightIndex] == 0)
        {
            // 只有一边有人
            return maxDisRightIndex - maxDisLeftIndex;
        }
        else
        {
            // 两边都有人
            return (maxDisRightIndex - maxDisLeftIndex) / 2;
        }
    }
}
