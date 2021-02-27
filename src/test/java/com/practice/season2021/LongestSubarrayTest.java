package com.practice.season2021;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class LongestSubarrayTest {
    private LongestSubarray ls = new LongestSubarray();

    @Test
    public void longestSubarray() {
        int [] nums = {8, 2, 4, 7};
        int limit = 4;
        System.out.println("re=" + ls.longestSubarray(nums, limit));

        nums = new int[]{10,1,2,4,7,2};
        limit = 5;
        System.out.println("re=" + ls.longestSubarray(nums, limit));

        nums = new int[]{4,2,2,2,4,4,2,2};
        limit = 0;
        System.out.println("re=" + ls.longestSubarray(nums, limit));

        nums = new int[]{9};
        limit = 5;

        int re = ls.longestSubarray(nums, limit);
        System.out.println("re=" + re);

//        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
//        map.put(3, "val");
//        map.put(2, "val");
//        map.put(1, "val");
//        map.put(5, "val");
//        map.put(4, "val");
//        System.out.println(map); // {5=val, 4=val, 3=val, 2=val, 1=val}
//        System.out.println("first=" + map.firstKey());
//        System.out.println("last=" + map.lastKey());
//
//        TreeMap<Integer, String> map1 = new TreeMap<>();
//        map1.put(3, "val");
//        map1.put(2, "val");
//        map1.put(1, "val");
//        map1.put(5, "val");
//        map1.put(4, "val");
//        map1.put(3, "val2");
//
//        System.out.println(map1);

    }
}