package com.practice.season2021;

import com.practice.alearn.B;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FindMedianSortedArraysTest {
    FindMedianSortedArrays fma = new FindMedianSortedArrays();

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(fma.findMedianSortedArrays(nums1, nums2));
    }
}