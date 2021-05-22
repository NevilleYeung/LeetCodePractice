package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountPairsTest {
    CountPairs cp = new CountPairs();

    @Test
    public void countPairs() {
        int[] deliciousness = {1,3,5,7,9};
        int ans = 0;
        ans = cp.countPairs(deliciousness);
        System.out.println(ans);

        deliciousness = new int[]{1,1,1,3,3,3,7};
        ans = cp.countPairs(deliciousness);
        System.out.println(ans);

        deliciousness = new int[]{2160,1936,3,29,27,5,2503,1593,2,0,16,0,3860,28908,6,2,15,49,6246,1946,23,105,7996,196,0,2,55,457,5,3,924,7268,16,48,4,0,12,116,2628,1468};
        ans = cp.countPairs(deliciousness);
        System.out.println(ans);
    }
}