package com.practice.season2021;

/**
 * 5. 最长回文子串
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class LongestPalindrome {
    /*
    给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

    示例 1：
    输入: "babad"
    输出: "bab"
    注意: "aba" 也是一个有效答案。

    示例 2：
    输入: "cbbd"
    输出: "bb"
     */

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + longest.length(); j <= s.length(); j++) {
                String tmp = s.substring(i, j);
                if (longest.length() < tmp.length() && isPalindrome(tmp)) {
                    longest = tmp;
                }
            }
        }

        return longest;
    }

    private boolean isPalindrome(String str) {
        if (str.length() < 2) {
            return true;
        }

        int end = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < end) {
                if (str.charAt(i) != str.charAt(end)) {
                    return false;
                }
            }
            end--;
        }

        return true;
    }
}
