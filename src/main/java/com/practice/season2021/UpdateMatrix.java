package com.practice.season2021;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 542. 01 矩阵
 * BFS
 * https://leetcode-cn.com/problems/01-matrix/
 */
public class UpdateMatrix {
    /*
    给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
    两个相邻元素间的距离为 1 。

    示例 1：
    输入：
    [[0,0,0],
     [0,1,0],
     [0,0,0]]

    输出：
    [[0,0,0],
     [0,1,0],
     [0,0,0]]

    示例 2：
    输入：
    [[0,0,0],
     [0,1,0],
     [1,1,1]]

    输出：
    [[0,0,0],
     [0,1,0],
     [1,2,1]]

    提示：
        给定矩阵的元素个数不超过 10000。
        给定矩阵中至少有一个元素是 0。
        矩阵中的元素只在四个方向上相邻: 上、下、左、右。
     */
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return mat;
        }

        int[][] ans = new int[mat.length][mat[0].length];
        boolean[][] bools = new boolean[mat.length][mat[0].length];
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new Node(i, j));
                    bools[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int[] ints: dirs) {
                int newi = node.i + ints[0];
                int newj = node.j + ints[1];

                if (newi < 0 || newi >= mat.length || newj < 0 || newj >= mat[0].length || bools[newi][newj]) {
                    continue;
                }
                ans[newi][newj] = ans[node.i][node.j] + 1;
                bools[newi][newj] = true;
                queue.offer(new Node(newi, newj));
            }
        }

        return ans;
    }

    private class Node {
        int i;
        int j;
        Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
