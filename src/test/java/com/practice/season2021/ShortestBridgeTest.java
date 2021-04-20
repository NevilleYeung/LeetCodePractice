package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestBridgeTest {
    ShortestBridge sb = new ShortestBridge();

    @Test
    public void shortestBridge() {
        int[][] A = {
                {0,1},
                {1,0}};
        System.out.println(sb.shortestBridge(A));
    }
}