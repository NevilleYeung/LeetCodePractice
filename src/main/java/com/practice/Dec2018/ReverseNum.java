package com.practice.Dec2018;

/**
 * 7. 整数反转
 * https://leetcode-cn.com/problems/reverse-integer/
 *
 */
public class ReverseNum
{
    /*
    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
    示例 1:
    输入: 123
    输出: 321

    示例 2:
    输入: -123
    输出: -321

    示例 3:
    输入: 120
    输出: 21

    注意:
    假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     */
    public int reverse(int x)
    {
        boolean isPositiveNum = true;
        if (x < 0)
        {
            isPositiveNum = false;
            x = Math.abs(x);
        }

        long re = 0l;

        while (x != 0)
        {
            re = re * 10 + x % 10;

            x = x / 10;
        }

        re = isPositiveNum ? re : -re;

        // 如果数字大于int的范围，返回0
        if (re < Integer.MIN_VALUE || Integer.MAX_VALUE < re)
        {
            return 0;
        }

        return (int)re;
    }
}
