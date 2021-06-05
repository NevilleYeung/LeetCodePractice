package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestTest {
    KthSmallest ks = new KthSmallest();

    @Test
    public void kthSmallest() {
        int[][] matrix = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };
        int k = 8;
        int ans = ks.kthSmallest(matrix, k);
        System.out.println(ans);

        matrix = new int[][]{
                {-5}
        };
        k = 1;
        ans = ks.kthSmallest(matrix, k);
        System.out.println(ans);
    }
}