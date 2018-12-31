package com.practice.Dec2018;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNumTest
{
    private ReverseNum reverseNum = new ReverseNum();

    @Test
    public void reverse()
    {
        System.out.println(reverseNum.reverse(-2147483648));

    }
}