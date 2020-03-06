package com.practice.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbStairsTest
{
    private ClimbStairs climbStairs = new ClimbStairs();

    @Test
    public void climbStairs()
    {
        int re = climbStairs.climbStairs(8);
        System.out.println(re);
    }
}