package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSatisfiedTest {
    MaxSatisfied ms = new MaxSatisfied();

    @Test
    public void maxSatisfied() {
        int [] customers = {1,0,1,2,1,1,7,5};
        int [] grumpy = {0,1,0,1,0,1,0,1};
        int X = 3;

        int re = ms.maxSatisfied(customers, grumpy, X);
        System.out.println("re=" + re);
        System.out.println("======");

    }
}