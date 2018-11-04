package com.practice.Oct2018;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstringTest
{

    @Test
    public void lengthOfLongestSubstring01()
    {
        String s = "abcabcbb";

        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        assertEquals(3 , ls.lengthOfLongestSubstring(s));
    }

    @Test
    public void lengthOfLongestSubstring02()
    {
        String s = "bbbbb";

        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        assertEquals(1 , ls.lengthOfLongestSubstring(s));

    }

    @Test
    public void lengthOfLongestSubstring03()
    {
        String s = "pwwkew";

        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        assertEquals(3 , ls.lengthOfLongestSubstring(s));
    }

    @Test
    public void lengthOfLongestSubstring04()
    {
        String s = "ea";

        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        assertEquals(2 , ls.lengthOfLongestSubstring(s));
    }

    @Test
    public void lengthOfLongestSubstring05()
    {
        String s = "abcabcbb456hr";

        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        assertEquals(6 , ls.lengthOfLongestSubstring(s));
    }

    @Test
    public void lengthOfLongestSubstring06()
    {
        String s = "cdd";

        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        assertEquals(2 , ls.lengthOfLongestSubstring(s));
    }

    @Test
    public void lengthOfLongestSubstring07()
    {
        String s = "dvdf";

        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        assertEquals(3 , ls.lengthOfLongestSubstring(s));
    }
}