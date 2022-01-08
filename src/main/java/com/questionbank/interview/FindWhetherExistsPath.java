package com.questionbank.interview;

import java.util.*;

/**
 * 面试题 04.01. 节点间通路
 * dfs/bfs
 * https://leetcode-cn.com/problems/route-between-nodes-lcci/
 */
public class FindWhetherExistsPath {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        if (graph == null || graph.length == 0) {
            return false;
        }

        // <start, targets>
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            Set<Integer> targetSet = map.getOrDefault(graph[i][0], new HashSet<>());
            targetSet.add(graph[i][1]);
            map.put(graph[i][0], targetSet);
        }

        boolean[] seen = new boolean[n];
        return dfs(map, start, target, seen);
    }

    // dfs回溯
    private boolean dfs(Map<Integer, Set<Integer>> map, int nowIndex, int target, boolean[] seen) {
        if (seen[nowIndex]) {
            return false;
        }

        Set<Integer> targetSet = map.get(nowIndex);
        if (targetSet == null) {
            return false;
        }

        seen[nowIndex] = true;

        for (int tg : targetSet) {
            if (tg == target) return true;

            if (dfs(map, tg, target, seen)) {
                return true;
            }
        }

        seen[nowIndex] = false;

        return false;
    }

    public static void main(String[] args) {
        FindWhetherExistsPath fe = new FindWhetherExistsPath();

        // 示例1:
        // 输入：n = 3, graph = [[0, 1], [0, 2], [1, 2], [1, 2]], start = 0, target = 2
        // 输出：true
        int n = 3;
        int[][] graph = {{0, 1}, {0, 2}, {1, 2}, {1, 2}};
        int start = 0;
        int target = 2;
        boolean ans = fe.findWhetherExistsPath(n, graph, start, target);
        System.out.println(ans);

        //示例2:
        // 输入：n = 5, graph = [[0, 1], [0, 2], [0, 4], [0, 4], [0, 1], [1, 3], [1, 4], [1, 3], [2, 3], [3, 4]], start = 0, target = 4
        // 输出 true
        n = 5;
        graph = new int[][]{{0, 1}, {0, 2}, {0, 4}, {0, 4}, {0, 1}, {1, 3}, {1, 4}, {1, 3}, {2, 3}, {3, 4}};
        start = 0;
        target = 4;
        ans = fe.findWhetherExistsPath(n, graph, start, target);
        System.out.println(ans);


        // 输出 true
        n = 5;
        graph = new int[][]{{0, 1}, {0, 2}, {0, 4}, {0, 4}, {0, 1}, {2, 3}, {3, 4}};
        start = 0;
        target = 3;
        ans = fe.findWhetherExistsPath(n, graph, start, target);
        System.out.println(ans);


        // 输出 false
        n = 5;
        graph = new int[][]{{0, 1}, {0, 2}, {0, 4}, {0, 4}, {0, 1}, {3, 4}};
        start = 0;
        target = 3;
        ans = fe.findWhetherExistsPath(n, graph, start, target);
        System.out.println(ans);
    }
}
