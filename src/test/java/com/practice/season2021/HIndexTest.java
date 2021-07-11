package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class HIndexTest {
    HIndex hIndex = new HIndex();

    @Test
    public void hIndex() {
        int[] citations = {3,0,6,1,5};
        int ans = hIndex.hIndex(citations);
        System.out.println(ans);
        assertEquals(3, ans);

        citations = new int[] {0,7,6,1,5, 4};
        ans = hIndex.hIndex(citations);
        System.out.println(ans);
        assertEquals(4, ans);
    }
}