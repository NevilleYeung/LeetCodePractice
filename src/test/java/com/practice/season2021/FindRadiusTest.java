package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindRadiusTest {
    FindRadius fr = new FindRadius();

    @Test
    public void findRadius() {
        int[] houses = {1,2,3};
        int[] heaters = {2};
        int ans = 0;
        ans = fr.findRadius(houses, heaters);
        System.out.println(ans);
        assertEquals(1, ans);

        houses = new int[] {1,2,3,4};
        heaters = new int[] {1,4};
        ans = fr.findRadius(houses, heaters);
        System.out.println(ans);
        assertEquals(1, ans);

        houses = new int[] {1,5};
        heaters = new int[] {2};
        ans = fr.findRadius(houses, heaters);
        System.out.println(ans);
        assertEquals(3, ans);

        houses = new int[] {9};
        heaters = new int[] {1};
        ans = fr.findRadius(houses, heaters);
        System.out.println(ans);
        assertEquals(8, ans);

        houses = new int[] {1,5};
        heaters = new int[] {10};
        ans = fr.findRadius(houses, heaters);
        System.out.println(ans);
        assertEquals(9, ans);

        houses = new int[] {1};
        heaters = new int[] {1,2,3,4};
        ans = fr.findRadius(houses, heaters);
        System.out.println(ans);
        assertEquals(0, ans);
    }
}