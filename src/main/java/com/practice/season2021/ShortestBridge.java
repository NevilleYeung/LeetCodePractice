package com.practice.season2021;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 934. 最短的桥
 * [dfs]
 * https://leetcode-cn.com/problems/shortest-bridge/
 */
public class ShortestBridge {
    /*
    在给定的二维二进制数组 A 中，存在两座岛。（岛是由四面相连的 1 形成的一个最大组。）
    现在，我们可以将 0 变为 1，以使两座岛连接起来，变成一座岛。
    返回必须翻转的 0 的最小数目。（可以保证答案至少是 1 。）

    示例 1：
    输入：A = [[0,1],[1,0]]
    输出：1

    示例 2：
    输入：A = [[0,1,0],[0,0,0],[0,0,1]]
    输出：2

    示例 3：
    输入：A = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
    输出：1

    提示：
    2 <= A.length == A[0].length <= 100
    A[i][j] == 0 或 A[i][j] == 1
     */

    // 坐标上下左右移动
    private static final int[][] DIRECTIONS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int shortestBridge(int[][] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        // dfs深度搜索找到第一个岛：
        // 把第一个岛屿的1变成2；
        // 把第一个岛屿的节点放入队列中。
        Queue<Node> island1 = new LinkedList<>();
        TO:
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) {
                    doDfs(island1, A, i, j);
                    break TO;
                }
            }
        }

        // 利用上一步的队列进行bfs广度搜索，找到另一个岛屿
        boolean [][] visited = new boolean[A.length][A[0].length];
        while (!island1.isEmpty()) {
            Node node = island1.poll();

            for (int[] ints: DIRECTIONS) {
                int newi = node.row + ints[0];
                int newj = node.col + ints[1];
                if (newi < 0 || newi >= A.length || newj < 0 || newj >= A[0].length || visited[newi][newj] || A[newi][newj] == 2) {
                    continue;
                }

                visited[newi][newj] = true;
                if (A[newi][newj] == 0) {
                    Node node1 = new Node(newi, newj, node.step + 1);
                    island1.offer(node1);
                } else {
                    return node.step;
                }
            }
        }

        return 0;
    }

    private void doDfs(Queue<Node> island1, int[][] A, int i, int j) {
        if (i < 0 || i >= A.length || j < 0 || j >= A[0].length || A[i][j] != 1) {
            return;
        }

        A[i][j] = A[i][j] + 1; // 由1变成2
        island1.add(new Node(i, j, 0));
        doDfs(island1, A, i + 1, j);
        doDfs(island1, A, i - 1, j);
        doDfs(island1, A, i, j + 1);
        doDfs(island1, A, i, j - 1);
    }

    private class Node {
        int row;

        int col;

        int step;

        Node(int row, int col, int step) {
            this.row = row;
            this.col = col;
            this.step = step;
        }
    }
}
