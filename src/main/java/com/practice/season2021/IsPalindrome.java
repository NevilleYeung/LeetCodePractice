package com.practice.season2021;

/**
 * 125. 验证回文串
 * 双指针
 * https://leetcode-cn.com/problems/valid-palindrome/
 */
public class IsPalindrome {
    /*
    给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
    说明：本题中，我们将空字符串定义为有效的回文串。

    示例 1:
    输入: "A man, a plan, a canal: Panama"
    输出: true

    示例 2:
    输入: "race a car"
    输出: false

    关键点：
    1、只考虑字母和数字字符
    2、忽略字母的大小写
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }

        char[] array = s.trim().toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (!isNumOrCharacter(array[left])) {
                left++;
                continue;
            }
            if (!isNumOrCharacter(array[right])) {
                right--;
                continue;
            }
            if (!String.valueOf(array[left]).equalsIgnoreCase(String.valueOf(array[right]))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isNumOrCharacter(char cc) {
        int nn = (int) cc;

        if ((65 <= nn && nn <= 90) || (97 <= nn && nn <= 122) || (48 <= nn && nn <= 57)) {
            return true;
        }

        return false;
    }
}
