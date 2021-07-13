package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDuplicateTest {
    FindDuplicate fd = new FindDuplicate();

    @Test
    public void findDuplicate() {
        int[] nums = {1,3,4,2,2};
        int ans = fd.findDuplicate(nums);
        System.out.println(ans);

        nums = new int[]{3,1,3,4,2};
        ans = fd.findDuplicate(nums);
        System.out.println(ans);

        nums = new int[]{1,1};
        ans = fd.findDuplicate(nums);
        System.out.println(ans);

        nums = new int[]{1,1,2};
        ans = fd.findDuplicate(nums);
        System.out.println(ans);
    }
}