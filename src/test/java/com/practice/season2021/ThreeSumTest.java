package com.practice.season2021;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {
    private ThreeSum ts = new ThreeSum();

    @Test
    public void threeSum() {
        //     输入：nums = [-1,0,1,2,-1,-4]
        //    输出：[[-1,-1,2],[-1,0,1]]
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = null;
        ans = ts.threeSum(nums);
        System.out.println(ans);

        // 输入：[0,0,0,0]
        nums = new int[]{0,0,0,0};
        ans = ts.threeSum(nums);
        System.out.println(ans);
    }
}