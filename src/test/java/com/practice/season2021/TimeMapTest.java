package com.practice.season2021;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TimeMapTest {

    @Test
    public void test1() {
        TimeMap tm = new TimeMap();
        tm.set("foo","bar",1);
        String value = tm.get("foo",1);
        System.out.println(value);
        value = tm.get("foo",3);
        System.out.println(value);
        tm.set("foo", "bar2", 4);
        value = tm.get("foo", 4); // 输出 "bar2"
        System.out.println(value);
        value = tm.get("foo", 5); // 输出 "bar2"
        System.out.println(value);

        System.out.println("====");

        tm = new TimeMap();
        tm.set("love","high",10);
        tm.set("love","low",20);
        value = tm.get("love", 5);
        System.out.println(value);
        value = tm.get("love", 10);
        System.out.println(value);
        value = tm.get("love", 15);
        System.out.println(value);
        value = tm.get("love", 20);
        System.out.println(value);
        value = tm.get("love", 25);
        System.out.println(value);

        System.out.println("====");

//        int[] nodes = {6,324,7564,23,54,1};
//        int left = 0;
//        int right = nodes.length;
//        int mid = 0;
//        int timestamp = 56;
//        while (left < right) {
//            mid = left + (right - left) / 2;
//
//
//            if (nodes[mid] == timestamp) {
//                System.out.println(mid);
//            } else if (nodes[mid] > timestamp) {
//                right = mid;
//            } else {
//                left = mid;
//            }
//        }
    }
}
