package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitAssignmentTest {
    MaxProfitAssignment mpa = new MaxProfitAssignment();

    @Test
    public void maxProfitAssignment() {
        /*
        1 <= difficulty.length = profit.length <= 10000
        1 <= worker.length <= 10000
        difficulty[i], profit[i], worker[i]  的范围是 [1, 10^5]
         */
        int[] difficulty = {2,4,6,8,10};
        int[] profit = {10,20,30,40,50};
        int[] worker = {4,5,6,7};
        int ans = 0;

        ans = mpa.maxProfitAssignment(difficulty, profit, worker);
        System.out.println(ans);

        difficulty = new int[]{1,1,3,2};
        profit = new int[]{2,5,6,1};
        worker = new int[]{1,3,1,2};
        ans = mpa.maxProfitAssignment(difficulty, profit, worker);
        System.out.println(ans);

    }
}