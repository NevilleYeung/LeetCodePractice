package com.practice.season2021;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class SeatManagerTest {

    @Test
    public void test01() {
//        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        })

        int ans = 0;
        SeatManager seatManager = new SeatManager(5); // 初始化 SeatManager ，有 5 个座位。
        ans = seatManager.reserve();    // 所有座位都可以预约，所以返回最小编号的座位，也就是 1 。
        System.out.println(ans);
        ans = seatManager.reserve();    // 可以预约的座位为 [2,3,4,5] ，返回最小编号的座位，也就是 2 。
        System.out.println(ans);
        seatManager.unreserve(2); // 将座位 2 变为可以预约，现在可预约的座位为 [2,3,4,5] 。
        ans = seatManager.reserve();    // 可以预约的座位为 [2,3,4,5] ，返回最小编号的座位，也就是 2 。
        System.out.println(ans);
        ans = seatManager.reserve();    // 可以预约的座位为 [3,4,5] ，返回最小编号的座位，也就是 3 。
        System.out.println(ans);
        ans = seatManager.reserve();    // 可以预约的座位为 [4,5] ，返回最小编号的座位，也就是 4 。
        System.out.println(ans);
        ans = seatManager.reserve();    // 唯一可以预约的是座位 5 ，所以返回 5 。
        System.out.println(ans);
        seatManager.unreserve(5); // 将座位 5 变为可以预约，现在可预约的座位为 [5] 。

        System.out.println("============");

        seatManager = new SeatManager(2);
        ans = seatManager.reserve();
        System.out.println(ans);
        seatManager.unreserve(1);
        ans = seatManager.reserve();
        System.out.println(ans);
        ans = seatManager.reserve();
        System.out.println(ans);
        seatManager.unreserve(2);
        ans = seatManager.reserve();
        System.out.println(ans);
        seatManager.unreserve(1);
        ans = seatManager.reserve();
        System.out.println(ans);
        seatManager.unreserve(2);
        ans = seatManager.reserve();
        System.out.println(ans);
    }

    @Test
    public void test02() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(213);
        queue.add(12);
        queue.add(54);
        queue.add(435);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
    }
}