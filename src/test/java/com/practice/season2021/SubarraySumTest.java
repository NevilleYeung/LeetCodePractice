package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraySumTest {
    private SubarraySum ss = new SubarraySum();

    @Test
    public void subarraySum() {
        int [] nums = {1,1,1};
        int k = 2;
        System.out.println(ss.subarraySum(nums, k));

        nums = new int[]{1,2,3};
        k = 3;
        System.out.println(ss.subarraySum(nums, k));
    }
}