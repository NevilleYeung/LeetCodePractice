package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void longestPalindrome() {
        LongestPalindrome l = new LongestPalindrome();


        String str1 = "babad";
        System.out.println(l.longestPalindrome(str1));

        str1 = "cbbd";
        System.out.println(l.longestPalindrome(str1));
    }
}