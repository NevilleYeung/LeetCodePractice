package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumIslandsTest {
    NumIslands ni = new NumIslands();

    @Test
    public void numIslands() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int ans = ni.numIslands(grid);
        System.out.println(ans);

        grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        ans = ni.numIslands(grid);
        System.out.println(ans);

        grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'}
        };
        ans = ni.numIslands(grid);
        System.out.println(ans);


        grid = new char[][]{
                {'0','0','0','0','0'},
                {'0','0','0','0','0'}
        };
        ans = ni.numIslands(grid);
        System.out.println(ans);

        grid = new char[][]{
                {'1','1','1'}
        };
        ans = ni.numIslands(grid);
        System.out.println(ans);
    }
}