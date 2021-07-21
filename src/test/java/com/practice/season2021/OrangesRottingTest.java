package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrangesRottingTest {
    OrangesRotting or = new OrangesRotting();

    @Test
    public void orangesRotting() {
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
        int ans = or.orangesRotting(grid);
        System.out.println(ans);
    }
}