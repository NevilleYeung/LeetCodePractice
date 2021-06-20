package com.practice.season2021;

/**
 * 74. 搜索二维矩阵
 * 二分查找
 * https://leetcode-cn.com/problems/search-a-2d-matrix/
 */
public class SearchMatrix2 {
    /*
    编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
    每行中的整数从左到右按升序排列。
    每行的第一个整数大于前一行的最后一个整数。

    示例 1：
    输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    输出：true

    示例 2：
    输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
    输出：false

    提示：
        m == matrix.length
        n == matrix[i].length
        1 <= m, n <= 100
        -104 <= matrix[i][j], target <= 104
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int ii = getIindex(matrix, target);
        if (ii < 0) return false;

        int start = 0;
        int end = matrix[0].length - 1;
        int middle = 0;
        while (start <= end) {
            middle = start + ((end - start) / 2);

            if (matrix[ii][middle] < target) {
                start = middle + 1;
            } else if (matrix[ii][middle] > target) {
                end = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    private int getIindex(int[][] matrix, int target) {
        int index = -1;
        if (target < matrix[0][0] || matrix[matrix.length - 1][matrix[0].length - 1] < target) {
            return index;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][matrix[0].length - 1]) {
                return i;
            }
        }

        return index;
    }
}
