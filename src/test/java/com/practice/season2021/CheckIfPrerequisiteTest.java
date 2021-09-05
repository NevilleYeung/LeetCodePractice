package com.practice.season2021;

import org.junit.Test;

import java.util.List;

public class CheckIfPrerequisiteTest {
    CheckIfPrerequisite cip = new CheckIfPrerequisite();

    @Test
    public void checkIfPrerequisite() {
        // 输入：n = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
        //输出：[false,true]
        int n = 2;
        int[][] prerequisites = {{1,0}};
        int[][] queries = {{0,1},{1,0}};
        List<Boolean> ans = cip.checkIfPrerequisite(n, prerequisites, queries);
        System.out.println(ans);
//        for (boolean aa : ans) {
//            assertEquals();
//        }

        // 输入：n = 2, prerequisites = [], queries = [[1,0],[0,1]]
        //输出：[false,false]
        n = 2;
        prerequisites = new int[][] {};
        queries = new int[][] {{1,0},{0,1}};
        ans = cip.checkIfPrerequisite(n, prerequisites, queries);
        System.out.println(ans);


        // 输入：n = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
        //输出：[true,true]
        n = 3;
        prerequisites = new int[][] {{1,2},{1,0},{2,0}};
        queries = new int[][] {{1,0},{1,2}};
        ans = cip.checkIfPrerequisite(n, prerequisites, queries);
        System.out.println(ans);


        // 输入：n = 3, prerequisites = [[1,0],[2,0]], queries = [[0,1],[2,0]]
        //输出：[false,true]
        n = 3;
        prerequisites = new int[][] {{1,0},{2,0}};
        queries = new int[][] {{0,1},{2,0}};
        ans = cip.checkIfPrerequisite(n, prerequisites, queries);
        System.out.println(ans);



        // 输输入：n = 5, prerequisites = [[0,1],[1,2],[2,3],[3,4]], queries = [[0,4],[4,0],[1,3],[3,0]]
        //输出：[true,false,true,false]
        n = 5;
        prerequisites = new int[][] {{0,1},{1,2},{2,3},{3,4}};
        queries = new int[][] {{0,4},{4,0},{1,3},{3,0}};
        ans = cip.checkIfPrerequisite(n, prerequisites, queries);
        System.out.println(ans);
    }
}