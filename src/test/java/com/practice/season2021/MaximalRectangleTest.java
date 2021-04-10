package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalRectangleTest {
    private MaximalRectangle mr = new MaximalRectangle();

    @Test
    public void maximalRectangle() {
        char [][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};

        int re = mr.maximalRectangle(matrix);
        System.out.println("result = " + re);

        matrix = new char[][] {{'1', '0'}};
        re = mr.maximalRectangle(matrix);
        System.out.println("result = " + re);
    }
}