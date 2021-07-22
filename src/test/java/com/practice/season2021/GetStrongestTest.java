package com.practice.season2021;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GetStrongestTest {
    GetStrongest gs = new GetStrongest();

    @Test
    public void getStrongest() {
        int [] arr = {1,2,3,4,5};
        int k = 2;
        int [] ans = gs.getStrongest(arr, k);
        System.out.println(Arrays.toString(ans));

        arr = new int[]{6,-3,7,2,11};
        k = 3;
        ans = gs.getStrongest(arr, k);
        System.out.println(Arrays.toString(ans));

        arr = new int[]{-7,22,17,3};
        k = 2;
        ans = gs.getStrongest(arr, k);
        System.out.println(Arrays.toString(ans));

        arr = new int[]{1,2,3,4,5};
        k = 5;
        ans = gs.getStrongest(arr, k);
        System.out.println(Arrays.toString(ans));

        arr = new int[]{6};
        k = 1;
        ans = gs.getStrongest(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}