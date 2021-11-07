package com.practice.season2021;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SearchRangeTest {
    SearchRange sr = new SearchRange();

    @Test
    public void searchRange() {
        // 输入：nums = [5,7,7,8,8,10], target = 8
        //输出：[3,4]
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = sr.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

        nums = new int[]{5,7,7,8,8,10};
        target = 6;
        ans = sr.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));


        nums = new int[]{};
        target = 0;
        ans = sr.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));


        nums = new int[]{5,5,5,5,5};
        target = 5;
        ans = sr.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}