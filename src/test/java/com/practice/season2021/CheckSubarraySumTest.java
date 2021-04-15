package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckSubarraySumTest {
    private CheckSubarraySum css = new CheckSubarraySum();

    @Test
    public void checkSubarraySum() {
        int[] nums = {23,2,4,6,7};
        int k = 2;
        System.out.println(css.checkSubarraySum(nums, k));

        k = 6;
        System.out.println(css.checkSubarraySum(nums, k));

        k = 100;
        System.out.println(css.checkSubarraySum(nums, k));

        nums = new int[]{2,4,6,42};
        k = 7;
        System.out.println(css.checkSubarraySum(nums, k));

        nums = new int[]{5,0,0,0};
        k = 3;
        System.out.println(css.checkSubarraySum(nums, k));

        nums = new int[]{0,1,0};
        k = 1;
        System.out.println(css.checkSubarraySum(nums, k));

        nums = new int[]{1,1};
        k = 1;
        System.out.println(css.checkSubarraySum(nums, k));
    }
}