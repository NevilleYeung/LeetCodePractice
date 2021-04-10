package com.practice.season2021;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DailyTemperaturesTest {
    private DailyTemperatures dt = new DailyTemperatures();

    @Test
    public void dailyTemperatures() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int [] re = dt.dailyTemperatures(temperatures);
        System.out.println("re=" + Arrays.toString(re));
    }
}