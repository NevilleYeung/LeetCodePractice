package com.practice.season2021;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateMatrixTest {
    UpdateMatrix um = new UpdateMatrix();

    @Test
    public void updateMatrix() {
        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        int[][] ans = um.updateMatrix(mat);
        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("---------");

        mat = new int[][]{
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        ans = um.updateMatrix(mat);
        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("---------");

        mat = new int[][]{
        };
        ans = um.updateMatrix(mat);
        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("---------");

        mat = new int[][]{
                {0,1,1},
                {1,1,1}
        };
        ans = um.updateMatrix(mat);
        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("---------");


        mat = new int[][]{
                {0,0,0},
                {0,0,0}
        };
        ans = um.updateMatrix(mat);
        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("---------");

        mat = new int[][]{
                {0,1,0}
        };
        ans = um.updateMatrix(mat);
        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("---------");
    }
}