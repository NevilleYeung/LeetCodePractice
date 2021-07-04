package com.practice.season2021;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FilterRestaurantsTest {
    FilterRestaurants fr = new FilterRestaurants();

    @Test
    public void filterRestaurants() {
        int[][] restaurants = {
                {1,4,1,40,10},
                {2,8,0,50,5},
                {3,8,1,30,4},
                {4,10,0,10,3},
                {5,1,1,15,1}
        };
        int veganFriendly = 1;
        int maxPrice = 50;
        int maxDistance = 10;
        List<Integer> ans = fr.filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance);
        System.out.println(ans);
        Integer[] excepted = {3,1,5};
        assertArrayEquals(excepted, ans.toArray());
    }
}