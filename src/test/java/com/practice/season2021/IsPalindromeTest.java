package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {
    IsPalindrome isp = new IsPalindrome();

    @Test
    public void isPalindrome() {
        //     示例 1:
        //    输入: "A man, a plan, a canal: Panama"
        //    输出: true
        //
        //    示例 2:
        //    输入: "race a car"
        //    输出: false
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isp.isPalindrome(s));

        s = "race a car";
        System.out.println(isp.isPalindrome(s));
    }
}