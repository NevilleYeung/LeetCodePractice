package com.practice.season2021;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 85. 最大矩形
 * https://leetcode-cn.com/problems/maximal-rectangle/
 */
public class MaximalRectangle {
    /*
    给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。

    // 图略

    示例 1：
    输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
    输出：6
    解释：最大矩形如上图所示。

    示例 2：
    输入：matrix = []
    输出：0

    示例 3：
    输入：matrix = [["0"]]
    输出：0

    示例 4：
    输入：matrix = [["1"]]
    输出：1

    示例 5：
    输入：matrix = [["0","0"]]
    输出：0

    提示：
    rows == matrix.length
    cols == matrix[0].length
    0 <= row, cols <= 200
    matrix[i][j] 为 '0' 或 '1'
     */
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        // 将问题转化为    84. 柱状图中最大的矩形    处理
        // 把matrix转化为matrixHeights，每一行代表一个柱状图的高度
        int [][] matrixHeights = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int height = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == '1') {
                    height++;
                } else {
                    height = 0;
                }
                matrixHeights[j][i] = height;
            }
        }

        // 计算每一行柱状图的最大面积，即可得到结果
        int max = 0;
        for (int i = 0; i < matrixHeights.length; i++) {

            // same as 84. 柱状图中最大的矩形 begin--
            Deque<Integer> stack = new ArrayDeque<>();
            for (int j = 0; j < matrixHeights[i].length; j++) {
                while (!stack.isEmpty() && matrixHeights[i][stack.peek()] > matrixHeights[i][j]) {
                    int top = stack.pop();
                    int width = 0;
                    if (!stack.isEmpty()) {
                        width = j - stack.peek() - 1;
                    } else {
                        width = j;
                    }

                    max = Math.max(max, width * matrixHeights[i][top]);
                }
                stack.push(j);
            }

            while (!stack.isEmpty()) {
                int top = stack.pop();
                int width = 0;
                if (!stack.isEmpty()) {
                    width = matrixHeights[i].length - stack.peek() - 1;
                } else {
                    width = matrixHeights[i].length;
                }

                max = Math.max(max, width * matrixHeights[i][top]);
            }
            // same as 84. 柱状图中最大的矩形 end--

        }

        return max;
    }
}
