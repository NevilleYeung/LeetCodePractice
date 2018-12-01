package com.practice.Dec2018;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest
{
    private PalindromeNumber pn = new PalindromeNumber();

    @Test
    public void isPalindrome01()
    {
        int num = 123321;
        System.out.println("re = " + pn.isPalindrome(num));
    }

    @Test
    public void isPalindromeWithoutString01()
    {
        int num = -1;
        Assert.assertEquals(false, pn.isPalindromeWithoutString(num));

        num = Integer.MIN_VALUE;
        Assert.assertEquals(false, pn.isPalindromeWithoutString(num));
    }

    @Test
    public void isPalindromeWithoutString02()
    {
        int num = 0;
        Assert.assertEquals(true, pn.isPalindromeWithoutString(num));

        num = 9;
        Assert.assertEquals(true, pn.isPalindromeWithoutString(num));

        num = 10;
        Assert.assertEquals(false, pn.isPalindromeWithoutString(num));

        num = 11;
        Assert.assertEquals(true, pn.isPalindromeWithoutString(num));
    }

    @Test
    public void isPalindromeWithoutString03()
    {
        int num = 54576525;
        Assert.assertEquals(false, pn.isPalindromeWithoutString(num));
    }

    @Test
    public void isPalindromeWithoutString04()
    {
        int num = 123321;
        Assert.assertEquals(true, pn.isPalindromeWithoutString(num));

        num = 9527259;
        Assert.assertEquals(true, pn.isPalindromeWithoutString(num));
    }

    @Test
    public void isPalindromeWithoutString05()
    {
        int num = Integer.MAX_VALUE;
        Assert.assertEquals(false, pn.isPalindromeWithoutString(num));
    }


    @Test
    public void isPalindromeOfficial01()
    {
        int num = 0;
        Assert.assertEquals(true, pn.isPalindromeOfficial(num));

        num = 9;
        Assert.assertEquals(true, pn.isPalindromeOfficial(num));

        num = 10;
        Assert.assertEquals(false, pn.isPalindromeOfficial(num));

        num = 11;
        Assert.assertEquals(true, pn.isPalindromeOfficial(num));


        num = 123321;
        Assert.assertEquals(true, pn.isPalindromeOfficial(num));

        num = 9527259;
        Assert.assertEquals(true, pn.isPalindromeOfficial(num));
    }
}