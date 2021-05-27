package com.practice.season2021;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolveTest {
    private Solve ss = new Solve();

    @Test
    public void solve() {
        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
//        ss.solve(board);
//        for (char[] cc : board) {
//            System.out.println(Arrays.toString(cc));
//        }
//        System.out.println();
//
//        board = new char[][] {
//                {'O','X','X','O'},
//                {'X','O','O','X'},
//                {'X','X','O','X'},
//                {'X','O','X','X'}
//        };
//        ss.solve(board);
//        for (char[] cc : board) {
//            System.out.println(Arrays.toString(cc));
//        }

        board = new char[][] {
                {'X','O','X','O','X','O'},
                {'O','X','O','X','O','X'},
                {'X','O','X','O','X','O'},
                {'O','X','O','X','O','X'}};
        ss.solve(board);
        for (char[] cc : board) {
            System.out.println(Arrays.toString(cc));
        }
    }
}