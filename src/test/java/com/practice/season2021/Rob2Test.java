package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rob2Test {
    Rob2 rob2 = new Rob2();

    @Test
    public void rob() {
        int[] nums = {2,3,2};
        System.out.println(rob2.rob(nums));

        nums = new int[]{1,2,3,1};
        System.out.println(rob2.rob(nums));
    }
}