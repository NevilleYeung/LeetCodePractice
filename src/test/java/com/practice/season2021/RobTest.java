package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobTest {
    private Rob rob = new Rob();

    @Test
    public void rob() {
        int[] nums = {1,2,3,1};
        System.out.println(rob.rob(nums));

        nums = new int[]{2,7,9,3,1};
        System.out.println(rob.rob(nums));
    }
}