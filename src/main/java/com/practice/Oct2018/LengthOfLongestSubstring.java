package com.practice.Oct2018;

/**
 * 3. 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 *
 */
public class LengthOfLongestSubstring
{
    /*
    给定一个字符串，找出不含有重复字符的最长子串的长度。
    示例 1:
    输入: "abcabcbb"
    输出: 3
    解释: 无重复字符的最长子串是 "abc"，其长度为 3。

    示例 2:
    输入: "bbbbb"
    输出: 1
    解释: 无重复字符的最长子串是 "b"，其长度为 1。

    示例 3:
    输入: "pwwkew"
    输出: 3
    解释: 无重复字符的最长子串是 "wke"，其长度为 3。

    请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
     */
    public int lengthOfLongestSubstring(String s)
    {
        if (s == null || s.length() == 0)
        {
            return 0;
        }
        // TODO 直接用这个方法获取字符更好
//        s.charAt(index);

        int lengthOfLongestSubstring = 1;
        char[] chars = s.toCharArray();
        // 子串的左坐标
        int leftIndex = 0;


        for (int i = 0; i < chars.length; i++)
        {
            for (int j = leftIndex; j < i; j++)
            {
                if (chars[j] == chars[i])
                {
                    if (lengthOfLongestSubstring < i - leftIndex)
                    {
                        lengthOfLongestSubstring = i - leftIndex;
                    }

                    leftIndex++;
                    i = leftIndex;
                    break;
                }
                else
                {
                    // 处理完全无重复字符以及最后部分才是最长子串的场景
                    if (j == chars.length - 2)
                    {
                        if (lengthOfLongestSubstring < chars.length - leftIndex)
                        {
                            lengthOfLongestSubstring = chars.length - leftIndex;
                        }
                    }
                }
            }
        }


        return lengthOfLongestSubstring;
    }
}
