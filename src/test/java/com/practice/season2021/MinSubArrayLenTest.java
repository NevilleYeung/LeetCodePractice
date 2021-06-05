package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinSubArrayLenTest {
    MinSubArrayLen msal = new MinSubArrayLen();

    @Test
    public void minSubArrayLen() {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int ans = msal.minSubArrayLen(target, nums);
        System.out.println(ans);

        target = 4;
        nums = new int[] {1,4,4};
        ans = msal.minSubArrayLen(target, nums);
        System.out.println(ans);

        target = 11;
        nums = new int[] {1,1,1,1,1,1,1,1};
        ans = msal.minSubArrayLen(target, nums);
        System.out.println(ans);
    }
}