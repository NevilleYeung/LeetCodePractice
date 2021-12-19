package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class isValidBracketsTest {
    isValidBrackets ivb = new isValidBrackets();

    @Test
    public void isValid() {
        //     输入：s = "()"
        //    输出：true
        String s = "()";
        boolean ans = ivb.isValid(s);
        System.out.println(ans);

        //    输入：s = "()[]{}"
        //    输出：true
        s = "()[]{}";
        ans = ivb.isValid(s);
        System.out.println(ans);

        //    输入：s = "(]"
        //    输出：false
        s = "(]";
        ans = ivb.isValid(s);
        System.out.println(ans);

        //    输入：s = "([)]"
        //    输出：false
        s = "([)]";
        ans = ivb.isValid(s);
        System.out.println(ans);

        //    输入：s = "{[]}"
        //    输出：true
        s = "{[]}";
        ans = ivb.isValid(s);
        System.out.println(ans);


        //    输入：s = "{{[]}"
        //    输出：false
        s = "{{[]}";
        ans = ivb.isValid(s);
        System.out.println(ans);

        //    输入：s = "}"
        //    输出：false
        s = "{{[]}";
        ans = ivb.isValid(s);
        System.out.println(ans);
    }
}