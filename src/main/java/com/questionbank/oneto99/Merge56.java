package com.questionbank.oneto99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 * https://leetcode-cn.com/problems/merge-intervals/
 */
public class Merge56 {
    /**
     * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
     *
     * 示例 1：
     * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
     * 输出：[[1,6],[8,10],[15,18]]
     * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     *
     * 示例 2：
     * 输入：intervals = [[1,4],[4,5]]
     * 输出：[[1,5]]
     * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
     *
     * 提示：
     * 1 <= intervals.length <= 104
     * intervals[i].length == 2
     * 0 <= starti <= endi <= 104
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> list = new ArrayList<>();
        int[] tmpInts = {intervals[0][0], intervals[0][1]};
        for (int i = 0; i < intervals.length; i++) {
            if (i + 1 == intervals.length) {
                list.add(new int[]{tmpInts[0], tmpInts[1]});
                break;
            }

            if (intervals[i + 1][0] <= tmpInts[1]) {
                tmpInts[1] = Math.max(tmpInts[1], intervals[i + 1][1]);
            } else {
                list.add(new int[]{tmpInts[0], tmpInts[1]});
                tmpInts[0] = intervals[i + 1][0];
                tmpInts[1] = intervals[i + 1][1];
            }
        }

        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        Merge56 merge = new Merge56();

        // 输出：[[1,6],[8,10],[15,18]]
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge.merge(intervals);
        for(int[] ints : ans) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("=====================");

        intervals = new int[][]{{1,4},{4,5}};
        ans = merge.merge(intervals);
        for(int[] ints : ans) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("=====================");

    }
}
