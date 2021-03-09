package com.practice.season2021;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MaxSlidingWindowTest {
    MaxSlidingWindow msw = new MaxSlidingWindow();

    @Test
    public void maxSlidingWindow() {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] re = msw.maxSlidingWindow(nums, k);
        System.out.println("re = " + Arrays.toString(re));
        System.out.println("===========");

        nums = new int[] {1};
        k = 1;
        re = msw.maxSlidingWindow(nums, k);
        System.out.println("re = " + Arrays.toString(re));
        System.out.println("===========");

        nums = new int[] {1, -1};
        k = 1;
        re = msw.maxSlidingWindow(nums, k);
        System.out.println("re = " + Arrays.toString(re));
        System.out.println("===========");

        nums = new int[] {9, 11};
        k = 2;
        re = msw.maxSlidingWindow(nums, k);
        System.out.println("re = " + Arrays.toString(re));
        System.out.println("===========");

        nums = new int[] {4, -2};
        k = 2;
        re = msw.maxSlidingWindow(nums, k);
        System.out.println("re = " + Arrays.toString(re));
        System.out.println("===========");
    }
}