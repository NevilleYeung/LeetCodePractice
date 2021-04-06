package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestRectangleAreaTest {
    private LargestRectangleArea lra = new LargestRectangleArea();

    @Test
    public void largestRectangleArea() {
        int [] heights = {2,1,5,6,2,3};

        int re = lra.largestRectangleArea(heights);
        System.out.println(re);
    }
}