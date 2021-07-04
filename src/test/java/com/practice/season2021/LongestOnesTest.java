package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestOnesTest {
    LongestOnes lo = new LongestOnes();

    @Test
    public void longestOnes() {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int ans = lo.longestOnes(nums, k);
        System.out.println(ans);

        nums = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        k = 3;
        ans = lo.longestOnes(nums, k);
        System.out.println(ans);

        nums = new int[]{0,0,0};
        k = 0;
        ans = lo.longestOnes(nums, k);
        System.out.println(ans);

        nums = new int[]{0,0,0};
        k = 1;
        ans = lo.longestOnes(nums, k);
        System.out.println(ans);

        nums = new int[]{1,1,1};
        k = 0;
        ans = lo.longestOnes(nums, k);
        System.out.println(ans);
    }
}