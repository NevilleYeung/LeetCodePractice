package com.practice.season2021;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 994. 腐烂的橘子
 * BFS
 * https://leetcode-cn.com/problems/rotting-oranges/
 */
public class OrangesRotting {
    /*
    在给定的网格中，每个单元格可以有以下三个值之一：
    值 0 代表空单元格；
    值 1 代表新鲜橘子；
    值 2 代表腐烂的橘子。
    每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。

    返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。

    示例 1：
    输入：[[2,1,1],[1,1,0],[0,1,1]]
    输出：4

    示例 2：
    输入：[[2,1,1],[0,1,1],[1,0,1]]
    输出：-1
    解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。

    示例 3：
    输入：[[0,2]]
    输出：0
    解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。

    提示：
    1 <= grid.length <= 10
    1 <= grid[0].length <= 10
    grid[i][j] 仅为 0、1 或 2
     */
    int[][] indexs = {
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1}
    };

    public int orangesRotting(int[][] grid) {
        Queue<Node> fulanQueue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    fulanQueue.offer(new Node(i, j));
                }
            }
        }

        int ans = bfs(grid, fulanQueue);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans;
    }

    private int bfs(int[][] grid, Queue<Node> queue) {
        // 记录每个腐烂节点的耗时时间，最后记录的就是答案
        Map<Node, Integer> timeMap = new HashMap<>();

        int layer = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int k = 0; k < len; k++) {
                Node node = queue.poll();

                for (int[] ints : indexs) {
                    int newi = node.ii + ints[0];
                    int newj = node.jj + ints[1];

                    if (0 <= newi && newi < grid.length && 0 <= newj && newj < grid[0].length && grid[newi][newj] == 1) {
                        grid[newi][newj] = 2;
                        layer = timeMap.getOrDefault(node, 0) + 1;
                        Node tmpNode = new Node(newi, newj);
                        queue.offer(tmpNode);

                        timeMap.put(tmpNode, layer);
                    }
                }
            }
        }

        return layer;
    }

    private class Node {
        int ii;
        int jj;
        Node(int ii, int jj) {
            this.ii = ii;
            this.jj = jj;
        }
    }
}
