package com.practice.season2021;

import java.util.*;

/**
 * 46. 全排列
 * DFS
 * https://leetcode-cn.com/problems/permutations/
 */
public class Permute {
    /*
    给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。

    示例 1：
    输入：nums = [1,2,3]
    输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

    示例 2：
    输入：nums = [0,1]
    输出：[[0,1],[1,0]]

    示例 3：
    输入：nums = [1]
    输出：[[1]]
     
    提示：
    1 <= nums.length <= 6
    -10 <= nums[i] <= 10
    nums 中的所有整数 互不相同
     */
    public List<List<Integer>> permute(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> tmpResult = new LinkedList<>();

        dfs(nums, tmpResult, ans, seen);

        return ans;
    }

    private void dfs(int[] nums, Deque<Integer> tmpResult, List<List<Integer>> ans, boolean[] seen) {
        if (tmpResult.size() == nums.length) {
            ans.add(new LinkedList<>(tmpResult));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (seen[i]) {
                continue;
            }

            tmpResult.add(nums[i]);
            seen[i] = true;
            dfs(nums, tmpResult, ans, seen);

            // 回溯
            seen[i] = false;
            tmpResult.pollLast();
        }
    }
}
