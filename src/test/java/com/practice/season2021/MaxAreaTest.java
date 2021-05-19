package com.practice.season2021;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import static org.junit.Assert.*;

public class MaxAreaTest
{
    MaxArea maxArea = new MaxArea();

    @Test
    public void maxArea()
    {
        /*
        n = height.length
        2 <= n <= 3 * 104
        0 <= height[i] <= 3 * 104
         */
        int [] height = {1,8,6,2,5,4,8,3,7};
        int re = 0;
        re = maxArea.maxArea(height);
        System.out.println(Arrays.toString(height) + " = " + re);  // 49


        height = new int[] {1,1};
        re = maxArea.maxArea(height);
        System.out.println(Arrays.toString(height) + " = " + re);  // 1

        height = new int[] {4,3,2,1,4};
        re = maxArea.maxArea(height);
        System.out.println(Arrays.toString(height) + " = " + re);  // 16

        height = new int[] {1,2,1};
        re = maxArea.maxArea(height);
        System.out.println(Arrays.toString(height) + " = " + re);  // 2

        height = new int[] {1,8,0,0,0,7};
        re = maxArea.maxArea(height);
        System.out.println(Arrays.toString(height) + " = " + re);  // 28

        height = new int[] {0,0,0};
        re = maxArea.maxArea(height);
        System.out.println(Arrays.toString(height) + " = " + re);  // 0
    }

    @Test
    public void test()
    {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        System.out.println("stack.getFirst()=" + stack.getFirst());
        System.out.println("stack.getLast()=" + stack.getLast());

        System.out.println(stack);
    }
}