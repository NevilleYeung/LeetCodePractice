package com.basic.binary;

/**
 * 二分查找
 * 在有序数组(顺序是由小到大)中，查询到输入数字的下标，找不到则返回-1
 */
public class BinarySearch
{
    /**
     * 有序数组，不重复
     * 非递归的方式
     * @param nums
     * @param value
     * @return
     */
    public int binarySearchNoRepeat(int[] nums, int value)
    {
        if (nums == null)
        {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int middle;

        while (left <= right)
        {
            // 用移位的方式来除以2，高效点
            middle = left + ((right - left) >> 1);

            if (nums[middle] < value)
            {
                left = middle + 1;
            }
            else if (value < nums[middle])
            {
                right = middle - 1;
            }
            else
            {
                return middle;
            }
        }

        return -1;
    }
}
