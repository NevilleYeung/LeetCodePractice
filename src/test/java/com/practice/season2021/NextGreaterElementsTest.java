package com.practice.season2021;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NextGreaterElementsTest {
    NextGreaterElements nge = new NextGreaterElements();

    @Test
    public void nextGreaterElements() {
        // 输入: [1,2,1]
        // 输出: [2,-1,2]
        int[] nums = {1,2,1};
        int[] re = null;
        re = nge.nextGreaterElements(nums);
        System.out.println(Arrays.toString(re));

        // 输入: [7,2,1,432,53,1,5]
        // 输出: [432,432,432,-1,432,5,7]
        nums = new int[]{7,2,1,432,53,1,5};
        re = nge.nextGreaterElements(nums);
        System.out.println(Arrays.toString(re));

        // 输入: [7,2,54,432,53,1,5]
        // 输出: [54,54,432,-1,54,5,7]
        nums = new int[]{7,2,54,432,53,1,5};
        re = nge.nextGreaterElements(nums);
        System.out.println(Arrays.toString(re));

        // 输入: [1,1,1,1,1]
        // 输出: [-1,-1,-1,-1,-1]
        nums = new int[]{1,1,1,1,1};
        re = nge.nextGreaterElements(nums);
        System.out.println(Arrays.toString(re));
    }
}