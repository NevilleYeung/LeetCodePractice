package com.basic.binary;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest
{
    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void binarySearchNoRepeat()
    {
        int[] nums = new int[7];
        System.out.println("input:");
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = i + 1;
            System.out.println(nums[i]);
        }

        int index = binarySearch.binarySearchNoRepeat(nums, 4);

        System.out.println("index is " + index);
    }
}