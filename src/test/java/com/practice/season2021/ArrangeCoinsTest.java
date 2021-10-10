package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrangeCoinsTest {
    ArrangeCoins ac = new ArrangeCoins();

    @Test
    public void arrangeCoins() {
        // 输入：n = 5
        // 输出：2
        int ans = ac.arrangeCoins(5);
        System.out.println(ans);


        // 输入：n = 8
        //输出：3
        ans = ac.arrangeCoins(8);
        System.out.println(ans);
    }
}