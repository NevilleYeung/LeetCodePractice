package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchMatrixTest {
    private SearchMatrix searchMatrix = new SearchMatrix();

    @Test
    public void searchMatrix() {
        int [][] matrix = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };


        System.out.println(searchMatrix.searchMatrix(matrix, 5));
        System.out.println(searchMatrix.searchMatrix(matrix, 111));

    }
}