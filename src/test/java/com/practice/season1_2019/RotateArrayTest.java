package com.practice.season1_2019;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest
{
    private RotateArray rotateArray = new RotateArray();

    @Test
    public void rotate()
    {
        int[] nums = new int[7];
        System.out.println("input:");
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = i + 1;
            System.out.println(nums[i]);
        }

        //
        rotateArray.rotate(nums, 3);

        System.out.println("output:");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void rotate01()
    {
        int[] nums = new int[7];
        System.out.println("input:");
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = i + 1;
            System.out.println(nums[i]);
        }

        //
        rotateArray.rotate01(nums, 3);

        System.out.println("output:");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}