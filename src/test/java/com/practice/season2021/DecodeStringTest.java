package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeStringTest {
    DecodeString ds = new DecodeString();

    @Test
    public void decodeString() {
        // 输入：s = "3[a]2[bc]"
        // 输出："aaabcbc"
        String s = "3[a]2[bc]";
        String ans = ds.decodeString(s);
        System.out.println(ans);
        assertEquals("aaabcbc", ans);


        // 输入：s = "3[a2[c]]"
        // 输出："accaccacc"
        s = "3[a2[c]]";
        ans = ds.decodeString(s);
        System.out.println(ans);
        assertEquals("accaccacc", ans);


        // 输入：s = "2[abc]3[cd]ef"
        // 输出："abcabccdcdcdef"
        s = "2[abc]3[cd]ef";
        ans = ds.decodeString(s);
        System.out.println(ans);
        assertEquals("abcabccdcdcdef", ans);



        // 输入：s = "abc3[cd]xyz"
        // 输出："abccdcdcdxyz"
        s = "abc3[cd]xyz";
        ans = ds.decodeString(s);
        System.out.println(ans);
        assertEquals("abccdcdcdxyz", ans);


        // 输入：s = "10[fds]"
        // 输出："fdsfdsfdsfdsfdsfdsfdsfdsfdsfds"
        s = "10[fds]";
        ans = ds.decodeString(s);
        System.out.println(ans);
        assertEquals("fdsfdsfdsfdsfdsfdsfdsfdsfdsfds", ans);
    }
}