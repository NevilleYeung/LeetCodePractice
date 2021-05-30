package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAreaOfIslandTest {
    MaxAreaOfIsland mai = new MaxAreaOfIsland();

    @Test
    public void maxAreaOfIsland() {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int ans = mai.maxAreaOfIsland(grid);
        System.out.println(ans);
        System.out.println("==========");

        grid = new int[][]{
                {0,0,0,0,0,0,0,0}
        };
        ans = mai.maxAreaOfIsland(grid);
        System.out.println(ans);
        System.out.println("==========");

        grid = new int[][]{
                {}
        };
        ans = mai.maxAreaOfIsland(grid);
        System.out.println(ans);
        System.out.println("==========");

        grid = new int[][]{
                {1,1,1,1,1,1,1}
        };
        ans = mai.maxAreaOfIsland(grid);
        System.out.println(ans);
        System.out.println("==========");
    }
}