package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountServersTest {
    CountServers cs = new CountServers();

    @Test
    public void countServers() {
        int[][] grid = {
                {1,0},
                {0,1}
        };
        int ans = cs.countServers(grid);
        System.out.println(ans);

        grid = new int[][]{
                {1,0},
                {1,1}
        };
        ans = cs.countServers(grid);
        System.out.println(ans);

        grid = new int[][]{
                {1,1,0,0},
                {0,0,1,0},
                {0,0,1,0},
                {0,0,0,1}
        };
        ans = cs.countServers(grid);
        System.out.println(ans);

        grid = new int[][]{
                {0,0,0,0}
        };
        ans = cs.countServers(grid);
        System.out.println(ans);

        grid = new int[][]{
                {1,1}
        };
        ans = cs.countServers(grid);
        System.out.println(ans);


        grid = new int[][]{
                {1,0,1,0},
                {0,0,0,0},
                {0,0,1,0},
                {0,0,0,1}
        };
        ans = cs.countServers(grid);
        System.out.println(ans);

    }
}