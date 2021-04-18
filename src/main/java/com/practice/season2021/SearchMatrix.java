package com.practice.season2021;

/**
 * 240. 搜索二维矩阵 II
 * https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 */
public class SearchMatrix {
    /*
    编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
    每行的元素从左到右升序排列。
    每列的元素从上到下升序排列。

    示例 1：
    // 图略
    输入：matrix = [
    [1,4,7,11,15],
    [2,5,8,12,19],
    [3,6,9,16,22],
    [10,13,14,17,24],
    [18,21,23,26,30]],
    target = 5
    输出：true

    示例 2：
    // 图略
    输入：matrix = [
    [1,4,7,11,15],
    [2,5,8,12,19],
    [3,6,9,16,22],
    [10,13,14,17,24],
    [18,21,23,26,30]],
    target = 20
    输出：false

    提示：
    m == matrix.length
    n == matrix[i].length
    1 <= n, m <= 300
    -109 <= matix[i][j] <= 109
    每行的所有元素从左到右升序排列
    每列的所有元素从上到下升序排列
    -109 <= target <= 109
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;

            while (left <= right) {
                int middle = left + ((right - left) >> 1);

                if (matrix[i][middle] == target) {
                    return true;
                } else if (matrix[i][middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }

        return false;
    }

    // 一样ok的写法
    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        for (int[] ints : matrix) {
            int left = 0;
            int right = ints.length - 1;

            while (left <= right) {
                int middle = left + ((right - left) >> 1);

                if (ints[middle] == target) {
                    return true;
                } else if (ints[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }

        return false;
    }
}