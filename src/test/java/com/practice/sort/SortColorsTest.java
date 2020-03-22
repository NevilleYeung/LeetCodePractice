package com.practice.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortColorsTest
{
    private SortColors sortColors = new SortColors();

    @Test
    public void sortColors()
    {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors.sortColors(nums);

        for (int i: nums) {
            System.out.println(i);
        }
    }
}