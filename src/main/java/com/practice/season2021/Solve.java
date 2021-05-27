package com.practice.season2021;

import java.util.Arrays;

/**
 * 130. 被围绕的区域
 * DFS
 * https://leetcode-cn.com/problems/surrounded-regions/
 */
public class Solve {
    /*
    给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。

    示例 1：
    // 图略
    输入：board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
    输出：[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
    解释：被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。

    示例 2：
    输入：board = [["X"]]
    输出：[["X"]]

    提示：
    m == board.length
    n == board[i].length
    1 <= m, n <= 200
    board[i][j] 为 'X' 或 'O'
     */
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        // 找到边界上的'O'，并将相连的所有'O'都变成'A'
        for (int i = 0; i < board.length; i++) {
            dfs(i, 0, board);
            dfs(i, board[0].length - 1, board);
        }
        for (int j = 0; j < board[0].length; j++) {
            dfs(0, j, board);
            dfs(board.length - 1, j, board);
        }

        // 剩下的'O'都是被围绕的，全部赋值为'X'; 把上一步的'A'改回'O'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(int i, int j, char[][] board) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }

        board[i][j] = 'A';
        dfs(i + 1, j, board);
        dfs(i - 1, j, board);
        dfs(i, j + 1, board);
        dfs(i, j - 1, board);
    }
}
