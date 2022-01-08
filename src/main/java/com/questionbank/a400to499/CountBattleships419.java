package com.questionbank.a400to499;

/**
 * 419. 甲板上的战舰
 * dfs
 * https://leetcode-cn.com/problems/battleships-in-a-board/
 */
public class CountBattleships419 {
    public int countBattleships(char[][] board) {
        int ans = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    ans++;
                    dfs(board, i, j);
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'X') {
            return;
        }

        board[i][j] = '.';

        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }

    public static void main(String[] args) {
        CountBattleships419 cb = new CountBattleships419();

        // 示例 1：
        //输入：board = [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
        //输出：2
        char[][] board = {
                {'X','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'}
        };
        int ans = cb.countBattleships(board);
        System.out.println(ans);

        //示例 2：
        //输入：board = [["."]]
        //输出：0
        board = new char[][]{
                {'.'}
        };
        ans = cb.countBattleships(board);
        System.out.println(ans);
    }
}
